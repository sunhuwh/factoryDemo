package com.sh.simple;

public class Test {
    
    public static void main(String[] args) {
        Factory f = new Factory();
        Parent p = f.createProduct("two");
        System.out.println(p.car());
    }
    
}
