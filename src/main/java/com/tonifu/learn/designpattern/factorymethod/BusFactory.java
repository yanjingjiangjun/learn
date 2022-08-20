package com.tonifu.learn.designpattern.factorymethod;

import com.tonifu.learn.designpattern.bean.Bus;
import com.tonifu.learn.designpattern.bean.Vehicle;

public class BusFactory implements IFactory{
    public Vehicle create() {
        return new Bus();
    }
}
