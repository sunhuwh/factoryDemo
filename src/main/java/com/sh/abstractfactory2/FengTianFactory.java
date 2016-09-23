package com.sh.abstractfactory2;

import com.sh.abstractfactory.FengTian;
import com.sh.abstractfactory.SUV;
import com.sh.abstractfactory.Type;

public class FengTianFactory implements CarAndTypeFactory{

    @Override
    public FengTian getCar() {
        return new FengTian();
    }

    @Override
    public Type getType() {
        return new SUV();
    }
    
    
    
}
