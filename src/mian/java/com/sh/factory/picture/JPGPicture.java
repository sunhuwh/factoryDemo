package com.sh.factory.picture;

public class JPGPicture implements Picture{

    @Override
    public void read(String data) {
        System.out.println("正在读取JPG图片");
    }
    
}
