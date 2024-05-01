package com.tonifu.learn.algorithm.test;

import com.tonifu.learn.designpattern.bean.BydCar;
import com.tonifu.learn.designpattern.bean.Car;
import com.tonifu.learn.designpattern.bean.Vehicle;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainTest<T> {
    public static void main(String[] args){
        MainTest<String> str = new MainTest<String>();
        Class variable = str.getClass();
        Type genType1 = variable.getGenericSuperclass();
        System.out.println(genType1);

        MainTest<String> str1 = new MainTest<String>(){};
        Class  clzz1=str1.getClass();
        ParameterizedType parameterizedType=(ParameterizedType)clzz1.getGenericSuperclass();
        Type type1=parameterizedType.getRawType();
        System.out.println(type1);
        Type type11=parameterizedType.getOwnerType();
        System.out.println(type11);
        Type[] types11=parameterizedType.getActualTypeArguments();
        System.out.println(types11[0]);

        List<? extends Vehicle> list1=getVehicle();
        for (int i = 0; i <list1.size() ; i++) {
            System.out.println(list1.get(i));
        }
        List<Vehicle> list2=new ArrayList<Vehicle>();
        addVehicle(list2);
        for (int i = 0; i <list1.size() ; i++) {
            System.out.println(list2.get(i));
        }
        List<Vehicle> list3=new ArrayList<Vehicle>();
        addVehicle(list2);
        for (int i = 0; i <list1.size() ; i++) {
            System.out.println(list2.get(i));
        }
    }
    public static List<? extends Vehicle> getVehicle(){
        List<BydCar> list=new ArrayList<BydCar>();
        list.add(new BydCar());
        list.add(new BydCar());
        return list;
    }

    public static void getVehicle(List<? extends Vehicle> list){
        if(null==list)return;
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void addVehicle(List<? super Vehicle> list){
        list.add(new BydCar());
        list.add(new BydCar());
    }
}
