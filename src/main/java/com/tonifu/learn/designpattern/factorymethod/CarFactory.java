package com.tonifu.learn.designpattern.factorymethod;

import com.tonifu.learn.designpattern.bean.Car;
import com.tonifu.learn.designpattern.bean.Vehicle;

public class CarFactory extends VehicleFactory{
    public Vehicle create() {
        return new Car();
    }
}
