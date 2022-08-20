package com.tonifu.learn.designpattern.abstractfactory;

import com.tonifu.learn.designpattern.bean.*;

public class TeslaFactory implements IFactory{

    public Vehicle createVehicle() {
        return new TeslaCar();
    }

    public Engine createEngine() {
        return new TeslaEngine();
    }

    public Battery createBattery() {
        return new TeslaBattery();
    }
}
