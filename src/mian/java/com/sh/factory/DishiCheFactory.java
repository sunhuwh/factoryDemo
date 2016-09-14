package com.sh.factory;

public class DishiCheFactory extends CarFactory{

    @Override
    public Car createCar() {
        return new DishiChe();
    }
    
    
}
