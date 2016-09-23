package com.sh.abstractfactory2;

import com.sh.abstractfactory.Car;
import com.sh.abstractfactory.Type;

public interface CarAndTypeFactory {
    
    public Car getCar();
    
    public Type getType();
    
}
