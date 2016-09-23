package com.sh.abstractfactory2;

import com.sh.abstractfactory.Car;
import com.sh.abstractfactory.Type;

public class Test {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        String factoryName = "com.sh.abstractfactory2.FengTianFactory";
        CarAndTypeFactory factory = (CarAndTypeFactory) Class.forName(factoryName).newInstance();
        Car car = factory.getCar();
        Type type = factory.getType();
        car.getName();
        type.getTypeName();
    }

}
