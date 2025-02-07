package com.tonifu.learn.designpattern.simplefactory;

import com.tonifu.learn.designpattern.bean.Vehicle;

public class Test {
    public static void main(String[] args) {
        Vehicle vehicle=Factory.getInstance().getVehicle("car");
        vehicle.run();
        T1 t1=new T1();
        try {
            t1.start();
            t1.t();
           //t1.test1();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    static class T1 extends Thread{
        private boolean flag=false;
        public void run(){
            synchronized (this){
                notifyAll();
                flag=true;
                System.out.println(111);
            }
        }
        public void test2(){
            synchronized (this){
                notifyAll();
            }
        }
        public void t() throws InterruptedException {
            synchronized (this){
                while(!flag){
                    System.out.println(0);
                    wait();
                    System.out.println(222);
                }
            }
        }
    }
}
