package com.sh.simple;

public class Factory {
    
    public Parent createProduct(String column){
        Parent p = null;
        if("one".equals(column)){
            p = new ChildrenOne();
        }else if("two".equals(column)){
            p = new ChildrenTwo();
        }
        return p;
    }
    
}
