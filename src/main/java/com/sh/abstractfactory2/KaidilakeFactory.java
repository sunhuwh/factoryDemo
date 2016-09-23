package com.sh.abstractfactory2;

import com.sh.abstractfactory.Car;
import com.sh.abstractfactory.Kaidilake;
import com.sh.abstractfactory.SUV;
import com.sh.abstractfactory.Type;

public class KaidilakeFactory implements CarAndTypeFactory{

    @Override
    public Car getCar() {
        return new Kaidilake();
    }

    @Override
    public Type getType() {
        return new SUV();
    }


}
