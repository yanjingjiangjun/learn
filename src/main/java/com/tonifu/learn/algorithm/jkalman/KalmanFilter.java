package com.tonifu.learn.algorithm.jkalman;

import com.tonifu.learn.algorithm.jkalman.jama.Matrix;
import com.tonifu.learn.algorithm.test.KalmanGpsFilter4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @Author fuj
 * @Date 2022-11-09 14:23
 * @PackageName:com.tonifu.learn.algorithm.jkalman
 * @ClassName: KalmanFilter
 * @Description: TODO
 * @Version 1.0
 */
public final class KalmanFilter {
    private static final class InnerKalmanFilter{
        private static final KalmanFilter INSTANCE=new KalmanFilter();
    }
    public final static KalmanFilter getInstance(){
        return InnerKalmanFilter.INSTANCE;
    }
    //数据清洗-卡尔曼滤波对GPS轨迹数据清洗
    public List<GpsLocation> dataClean(List<GpsLocation> data){
        List<GpsLocation> res=new ArrayList<>();
        //时间间隔(时间间隔)
        double T = 1.0/900;
        //经度方差(水平位置)
        double JDFX = 5.8;
        //纬度方差(垂直位置)
        double WDFX = 1.3;
        //状态矩阵(初始值不重要,会自动更正)
        double[][] X_ARRAY = {
                {data.get(0).getLongitude()},
                {0},
                {data.get(0).getLatitude()},
                {0}
        };
        AtomicReference<Matrix> X = new AtomicReference<>(new Matrix(X_ARRAY));
        //状态协方差矩阵(初始值不重要,会自动更正)
        double[][] P_ARRAY = {
                {1,0,0,0},
                {0,1,0,0},
                {0,0,1,0},
                {0,0,0,1}
        };
        AtomicReference<Matrix> P = new AtomicReference<>(new Matrix(P_ARRAY));
        //状态转移矩阵
        double[][] F_ARRAY = {
                {1,T,0,0},
                {0,1,0,0},
                {0,0,1,T},
                {0,0,0,1}
        };
        Matrix F = new Matrix(F_ARRAY);
        //状态转移协方差矩阵(对误差忽略不计)
        double[][] Q_ARRAY ={
                {0.0001,0,0,0},
                {0,0.0001,0,0},
                {0,0,0.0001,0},
                {0,0,0,0.0001}
        };
        Matrix Q = new Matrix(Q_ARRAY);
        //观测矩阵(观测经度纬度)
        double[][] H_ARRAY = {
                {1,0,0,0},
                {0,0,1,0}
        };
        Matrix H = new Matrix(H_ARRAY);
        //观测噪声方差(对角线为各维度方差)
        double[][] R_ARRAY = {
                {JDFX,0},
                {0,WDFX},
        };
        Matrix R = new Matrix(R_ARRAY);
        //I 维度为4
        double[][] I_ARRAY = {
                {1,0,0,0},
                {0,1,0,0},
                {0,0,1,0},
                {0,0,0,1}
        };
        Matrix I = new Matrix(I_ARRAY);
        List<GpsLocation> removeShipList = new ArrayList<>();
        AtomicInteger i= new AtomicInteger();
        data.forEach(ship -> {
            try {
                i.getAndIncrement();
                //==============第1条式子==============
                Matrix X_ = F.times(X.get());
                //==============第2条式子==============
                Matrix P_ = F.times(P.get()).times(F.transpose()).plus(Q);
                //==============第3条式子==============
                Matrix K = P_.times(H.transpose()).times(H.times(P_).times(H.transpose()).plus(R).inverse());
                //==============第4条式子==============
                //水平位置
                double Px_tt=ship.getLongitude();
                //垂直位置
                double Py_tt=ship.getLatitude();
                double[][] Z_ARRAY = {
                        {Px_tt},
                        {Py_tt}
                };
                Matrix Z = new Matrix(Z_ARRAY);
                X.set(X_.plus(K.times(Z.minus(H.times(X_)))));
                //==============第5条式子==============
                P.set(I.minus(K.times(H)).times(P_));
                //==============数据清洗==============
                double abs = Math.abs(ship.getLatitude() - X.get().get(2, 0));
                double abs1 = Math.abs(ship.getLongitude() - X.get().get(0, 0));
                //清除噪声
                System.out.println(abs+","+abs1);
                if(abs1>=0.001||abs>=0.001){//if(abs1>=0.8||abs>=0.8){
                    removeShipList.add(ship);
                    GpsLocation gpsLocation=new GpsLocation(X.get().get(0,0),X.get().get(2,0));
                    res.add(gpsLocation);
                    /*System.out.println();
                    System.out.println("\033[32;4m" + "======================================《《filter start》》 ===================================================" + "\033[0m");
                    System.out.println("序号: "+i.get()+"  old-JD:"+Px_tt+"  old-WD:"+Py_tt+"  new-JD:"+X.get().get(0,0)+"  new-WD:"+X.get().get(2,0));
                    System.out.println("\033[32;4m" + "=============================================================================================================" + "\033[0m");
                    System.out.println();*/
                }else {
                    GpsLocation gpsLocation=new GpsLocation(Px_tt,Py_tt);
                    res.add(gpsLocation);
                    //System.out.println("序号: "+i.get()+"  old-JD:"+Px_tt+"  old-WD:"+Py_tt+"  new-JD:"+X.get().get(0,0)+"  new-WD:"+X.get().get(2,0));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        //System.out.println("count :"+removeShipList.size());
        data.removeAll(removeShipList);
        return res;
    }
    
    
    public static class GpsLocation{
        private double latitude;
        private double longitude;

        public GpsLocation(double JD, double WD) {
            this.longitude = JD;
            this.latitude = WD;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }
    }
    
}
