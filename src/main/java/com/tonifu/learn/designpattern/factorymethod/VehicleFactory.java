package com.tonifu.learn.designpattern.factorymethod;

import com.tonifu.learn.designpattern.bean.Vehicle;

public abstract class VehicleFactory implements IFactory{
    public abstract Vehicle create() ;
    public Vehicle getVehicle(){
        return create();
    }
}
