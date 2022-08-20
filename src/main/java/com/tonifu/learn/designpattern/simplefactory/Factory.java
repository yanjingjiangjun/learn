package com.tonifu.learn.designpattern.simplefactory;

import com.tonifu.learn.designpattern.bean.Bus;
import com.tonifu.learn.designpattern.bean.Car;
import com.tonifu.learn.designpattern.bean.Vehicle;

public enum Factory {
    instance;
    public static Factory getInstance(){
        return instance;
    }
    public Vehicle getVehicle(String type){
        if("car".equals(type)){
            return new Car();

        }else if("bus".equals(type)){
            return new Bus();
        }
        return null;
    }
}
