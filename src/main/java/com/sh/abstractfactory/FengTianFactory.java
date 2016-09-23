package com.sh.abstractfactory;

public class FengTianFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new FengTian();
    }

}
