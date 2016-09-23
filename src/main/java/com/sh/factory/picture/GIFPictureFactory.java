package com.sh.factory.picture;


public class GIFPictureFactory implements PictureFactory {

    @Override
    public Picture getPictureTarget() {
        return new GIFPicture();
    }

}
