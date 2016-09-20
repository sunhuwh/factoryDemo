package com.sh.simple;

import com.sh.util.XMLUtil;

public class Test {
    
    public static void main(String[] args) {
        String configUrl = "src/mian/java/com/sh/simple/config.xml";
        String type = XMLUtil.getType(configUrl);
        Parent p;
        p = Factory.createProduct(type);
        System.out.println(p.car());
    }
    
}
