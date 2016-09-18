package com.sh.simple;

public class Test {
    
    public static void main(String[] args) {
        Parent p;
        p = Factory.createProduct("two");
        System.out.println(p.car());
    }
    
}
