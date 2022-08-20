package com.tonifu.learn.designpattern.factorymethod;

import com.tonifu.learn.designpattern.bean.Car;
import com.tonifu.learn.designpattern.bean.Vehicle;

public class CarFactory implements IFactory{
    public Vehicle create() {
        return new Car();
    }
}
