package com.tonifu.learn.designpattern.factorymethod;

import com.tonifu.learn.designpattern.bean.Bus;
import com.tonifu.learn.designpattern.bean.Vehicle;

public class Test {
    public static void main(String[] args) {
        VehicleFactory iFactory=new BusFactory();
        Vehicle bus=iFactory.getVehicle();
        bus.run();
    }
}
