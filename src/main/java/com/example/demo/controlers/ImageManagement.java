package com.example.demo.controlers;

import com.example.demo.models.Image;
import com.example.demo.models.ReferenceSheetFeatures;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

import static com.example.demo.controlers.AdaptationSize.orientationValidator;
import static com.example.demo.controlers.FileManagement.saveImage;
import static com.example.demo.controlers.CalculatePecentage.*;

public class ImageManagement {


    public BufferedImage initialImage;
    BufferedImage finalImage;

    public void copyImage(String initialImagePath, String finalImagePath, ReferenceSheetFeatures pReferenceSheetFeatures) {
        BufferedImage imageToConvert = loadImage(initialImagePath);



        int percentage = orientationValidator(imageToConvert,pReferenceSheetFeatures );
        System.out.println("Nuevo Tamaño :" + imageToConvert.getWidth() * percentage / 100 + " X" + imageToConvert.getHeight() * percentage / 100);
        BufferedImage newImage = resize(imageToConvert, imageToConvert.getWidth() * percentage / 100, imageToConvert.getHeight() * percentage / 100);


        saveImage(newImage, finalImagePath);
    }

    public static BufferedImage resize(BufferedImage bufferedImage, int newW, int newH) {


        int w = bufferedImage.getWidth();
        int h = bufferedImage.getHeight();
        BufferedImage bufim = new BufferedImage(newW, newH, bufferedImage.getType());
        Graphics2D g = bufim.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.drawImage(bufferedImage, 0, 0, newW, newH, 0, 0, w, h, null);
        g.dispose();
        return bufim;
    }


    public BufferedImage loadImage(String pathName) {
        try {
            this.finalImage = ImageIO.read(new File(pathName));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.finalImage;
    }


}
