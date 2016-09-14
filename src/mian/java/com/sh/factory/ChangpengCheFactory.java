package com.sh.factory;

public class ChangpengCheFactory extends CarFactory{

    @Override
    public Car createCar() {
        return new ChangePengChe();
    }
    
}
