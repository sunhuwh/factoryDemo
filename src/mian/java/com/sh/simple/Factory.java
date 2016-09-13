package com.sh.simple;

public class Factory {
    
    public void createProduct(String column){
        if("one".equals(column)){
            Parent p = new ChildrenOne();
            System.out.println(p.car());
        }else if("two".equals(column)){
            Parent p = new ChildrenTwo();
            System.out.println(p.car());
        }
    }
    
}
