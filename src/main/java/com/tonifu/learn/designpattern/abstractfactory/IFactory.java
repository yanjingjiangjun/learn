package com.tonifu.learn.designpattern.abstractfactory;

import com.tonifu.learn.designpattern.bean.Battery;
import com.tonifu.learn.designpattern.bean.Engine;
import com.tonifu.learn.designpattern.bean.Vehicle;

public interface IFactory {
    Vehicle createVehicle();
    Engine createEngine();
    Battery createBattery();

}
