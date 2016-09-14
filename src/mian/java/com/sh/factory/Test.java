package com.sh.factory;

public class Test {
    
    public static void main(String[] args) {
        CarFactory carFactory = new ChangpengCheFactory();
        Car car = carFactory.createCar();
        System.out.println(car.getName());
    }
    
}
