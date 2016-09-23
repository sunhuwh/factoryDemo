package com.sh.factory.picture;

public class Test {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        String data = "";
        String pictureClass = "com.sh.factory.picture.GIFPictureFactory";
        PictureFactory factory = (PictureFactory) Class.forName(pictureClass).newInstance();
        Picture p = factory.getPictureTarget();
        p.read(data);
    }
}
