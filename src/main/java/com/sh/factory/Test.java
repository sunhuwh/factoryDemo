package com.sh.factory;

import com.sh.util.XMLUtil;


public class Test {
    
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String configUrl = "src/main/java/com/sh/factory/config.xml";
        Class c = Class.forName(XMLUtil.getType(configUrl));
        CarFactory carFactory = (CarFactory) c.newInstance();
        Car car = carFactory.createCar();
        System.out.println(car.getName());
    }
    
}
