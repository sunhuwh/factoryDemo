package com.sh.abstractfactory;

public class LimousineFactory implements TypeFactory{

    @Override
    public Type getType() {
        return new Limousine();
    }
    
}
