package models;

import java.awt.image.BufferedImage;

public class Image {
    public int heigh;
    public int width;
    public BufferedImage initialImage;

    public Image(int heigh, int width) {
        this.heigh = heigh;
        this.width = width;
    }
    public Image(BufferedImage initialImage) {
       this.initialImage=initialImage;
       this.width=initialImage.getWidth();
        this.heigh=initialImage.getHeight();
    }

    public int getHeigh() {
        return initialImage.getHeight();
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }

    public int getWidth() {
        return initialImage.getWidth();
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public BufferedImage getInitialImage() {
        return initialImage;
    }

    public void setInitialImage(BufferedImage initialImage) {
        this.initialImage = initialImage;
    }
}
