package com.sh.factory.picture;


public class JPGPictureFactory implements PictureFactory {

    @Override
    public Picture getPictureTarget() {
        return new JPGPicture();
    }

}
