package com.tonifu.learn.algorithm.test;

import com.tonifu.learn.algorithm.util.NumberUtil;

/**
 * @Author fuj
 * @Date 4/19/23 2:50 PM
 * @PackageName:com.tonifu.learn.algorithm.test
 * @ClassName: Crcutil
 * @Description: TODO
 * @Version 1.0
 */
public class Crcutil {

    public static void main(String[] args) {
        // 用作测试的输入数据和生成多项式
        byte[] inputData = hexStringToByteArray("01020304");
        //byte[] inputData = new byte[] {0x01, 0x02, 0x03, 0x04};
        int polynomial = 0x8005;

        // 计算 CRC 校验值
        int checksum = CRC16(polynomial, 0, inputData, inputData.length);

        // 输出校验值
        System.out.println(String.format("0x%04X", checksum));
        Double_2Bytes();
        getMsbAndLsb("04f3");
    }

    public static int CRC16(int polynomial, int seed, byte[] input,
                            int nbrOfBytes){
        // 100-byte，需要花费824us @ 12MHz

        int crc = seed, bit = 0, byteCtr = 0;

        for (byteCtr = 0; byteCtr < nbrOfBytes; byteCtr++){
            crc ^= input[byteCtr] << 8;
            for (bit = 8; bit > 0; bit--){
                if ((crc & 0x8000) != 0){
                    crc = (crc << 1) ^ polynomial;
                } else {
                    crc <<= 1;
                }
            }
        }
        return (crc&0x0000ffff);
    }

    public static byte[] hexStringToByteArray(String hex) {

        int len = hex.length();
        if(len%2!=0)return new byte[]{0x00,0x00,0x00,0x00};
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(hex.charAt(i), 16) << 4)
                    + Character.digit(hex.charAt(i+1), 16));
        }
        return data;
    }


    public static int[] getMsbAndLsb(String hexString){
        int v=Integer.parseInt(hexString,16);
        int lsb=v&0x00ff;
        System.out.println(lsb);
        int msb=(v&0xff00)>>>8;
        System.out.println(msb);
        //int result = (msb << 8) + lsb;
        //System.out.println(result);
        int x=(msb << 8)+lsb;
        double ans=0;
        if(x>0x8000){
            ans=(x-65536)/100.0;
        }else{
            ans=x/100.0;
        }
        System.out.println(ans);
        return new int[]{msb,lsb};
    }

    public static void Double_2Bytes()
    {

        double source=5000;
        source = source * 100;
        if (source<0)
        {
            source += 65536;
        }
        byte[] result = new byte[2];
        if (source < 256)
        {
            result[0] = 0;
            result[1] = (byte)source;
        }else
        {
            result[0] = (byte)(source / 256);

            result[1] = (byte)(source - result[0] * 256);
            try {
                int s1=NumberUtil.bytesToPositiveInt(new byte[]{result[0]});
                int s2=NumberUtil.bytesToPositiveInt(new byte[]{result[1]});
                int x=s1*256+s2;
                double ans=0;
                if(x>0x8000){
                    ans=(x-65536)/100.0;
                }else{
                    ans=x/100.0;
                }
                System.out.println(s1+"，"+s2+","+ans);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
