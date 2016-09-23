package com.sh.abstractfactory;

public class Test {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        String carFactoryClassName = "com.sh.abstractfactory.KaidilakeFactory";
        String typeFactoryClassName = "com.sh.abstractfactory.SUVFactory";
        
        CarFactory carFactory = (CarFactory) Class.forName(carFactoryClassName).newInstance();
        Car car = carFactory.createCar();
        car.getName();
        
        TypeFactory typeFactory = (TypeFactory) Class.forName(typeFactoryClassName).newInstance();
        Type type = typeFactory.getType();
        type.getTypeName();
        
    }

}
