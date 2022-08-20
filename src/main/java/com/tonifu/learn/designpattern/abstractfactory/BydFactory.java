package com.tonifu.learn.designpattern.abstractfactory;

import com.tonifu.learn.designpattern.bean.*;

public class BydFactory implements IFactory{
    public Vehicle createVehicle() {
        return new BydCar();
    }

    public Engine createEngine() {
        return new BydEngine();
    }

    public Battery createBattery() {
        return new BydBattery();
    }
}
