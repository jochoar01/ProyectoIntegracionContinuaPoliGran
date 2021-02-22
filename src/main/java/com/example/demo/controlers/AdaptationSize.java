package com.example.demo.controlers;
import com.example.demo.models.Image;
import com.example.demo.models.ReferenceSheetFeatures;

import java.awt.image.BufferedImage;

import static com.example.demo.controlers.CalculatePecentage.calculatePercentage;



public class AdaptationSize {


    public static int orientationValidator(BufferedImage image , ReferenceSheetFeatures referenceSheetFeatures) {
        int percentage=0;
        if (image.getHeight() > image.getWidth()) {
            percentage = (int)(calculatePercentage(image.getHeight(),referenceSheetFeatures.getLongSize())*100);
            System.out.println("Imagen Vertical");
        } else {
            if (image.getHeight() < image.getWidth()) {
                percentage = (int)(calculatePercentage(image.getWidth(),referenceSheetFeatures.getLongSize())*100);
                System.out.println("Imagen Horizontal");
            } else {
                percentage = (int)(calculatePercentage(image.getHeight(),referenceSheetFeatures.getShortSize())*100);
                System.out.println("Imagen Cuadrada");
            }
        }
        return percentage;
    }



}
