package vn.edu.usth.facebook.Picture;

public class PictureItem {

    int image_1, image_2, image_3, image_4;

    public PictureItem(int image1, int image2, int image3, int image4) {
        this.image_1 = image1;
        this.image_2 = image2;
        this.image_3 = image3;
        this.image_4 = image4;
    }

    public int getImage_1() {
        return image_1;
    }

    public void setImage_1(int image) {
        this.image_1 = image;
    }

    public int getImage_2() {
        return image_2;
    }

    public void setImage_2(int image) {
        this.image_2 = image;
    }

    public int getImage_3() {
        return image_3;
    }

    public void setImage_3(int image) {
        this.image_3 = image;
    }

    public int getImage_4() {
        return image_4;
    }

    public void setImage_4(int image) {
        this.image_4 = image;
    }

}
