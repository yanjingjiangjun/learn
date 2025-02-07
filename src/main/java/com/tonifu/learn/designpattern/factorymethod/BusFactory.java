package com.tonifu.learn.designpattern.factorymethod;

import com.tonifu.learn.designpattern.bean.Bus;
import com.tonifu.learn.designpattern.bean.Vehicle;

public class BusFactory extends VehicleFactory{
    public Vehicle create() {
        return new Bus();
    }
}
