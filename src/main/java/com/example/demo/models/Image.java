package com.example.demo.models;

import java.awt.image.BufferedImage;

public class Image {
    public double heigh;
    public double width;
    public BufferedImage image;

    public Image(int heigh, int width) {
        this.heigh = heigh;
        this.width = width;
    }

    public Image(BufferedImage image) {
        this.image = image;
    }

    public double getHeigh() {
        return (double) image.getHeight();
    }

    public double getWidth() {
        return (double) image.getWidth();
    }

    public BufferedImage getImage() {
        return image;
    }
}
