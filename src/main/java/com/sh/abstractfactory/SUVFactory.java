package com.sh.abstractfactory;

public class SUVFactory implements TypeFactory {

    @Override
    public Type getType() {
        return new SUV();
    }

}
