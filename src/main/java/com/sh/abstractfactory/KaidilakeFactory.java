package com.sh.abstractfactory;

public class KaidilakeFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new Kaidilake();
    }

}
