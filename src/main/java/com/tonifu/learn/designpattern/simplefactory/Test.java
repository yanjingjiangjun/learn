package com.tonifu.learn.designpattern.simplefactory;

import com.tonifu.learn.designpattern.bean.Vehicle;

public class Test {
    public static void main(String[] args) {
        Vehicle vehicle=Factory.getInstance().getVehicle("car");
        vehicle.run();
    }
}
