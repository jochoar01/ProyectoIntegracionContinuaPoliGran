package Controlers;

import models.Image;
import models.ReferenceSheetFeatures;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

import static Controlers.FileManagement.saveImage;
import static Controlers.SizeManagement.calculatePercentage;

public class ImageManagement {

    public static int MAX_WIDTH = 2000;
    public static int MAX_HEIGHT = 2000;
    public BufferedImage initialImage;
    BufferedImage finalImage;

    public void copyImage(String initialImagePath, String finalImagePath, int heigh, int width ) {

        this.initialImage = loadImage(initialImagePath);
        Image image = new Image(this.initialImage);
        ReferenceSheetFeatures referenceSheetFeatures = new ReferenceSheetFeatures(heigh,width);
        double percentage = calculatePercentage(image,referenceSheetFeatures);





            this.initialImage = resize(this.initialImage,this.initialImage.getWidth()*(1+(int)percentage), this.initialImage.getHeight()*(1+(int)percentage));



        saveImage(this.initialImage, finalImagePath);
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
