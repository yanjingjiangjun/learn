package com.tonifu.learn.designpattern.abstractfactory;

import com.tonifu.learn.designpattern.bean.Battery;

public class Test {
    public static void main(String[] args) {
        IFactory factory=new TeslaFactory();
        Battery battery=factory.createBattery();
        battery.run();

    }
}
