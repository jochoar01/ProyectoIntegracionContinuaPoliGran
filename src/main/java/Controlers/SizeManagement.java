package Controlers;

import models.Image;
import models.ReferenceSheetFeatures;

public class SizeManagement {
    private static double percentageWidth;
    private static double percentageheigh;


    public static double calculatePercentage(Image image, ReferenceSheetFeatures referenceSheetFeatures) {
        double percentage = 0.0;

        if (image.width > referenceSheetFeatures.width || image.heigh > referenceSheetFeatures.heigh) {
            percentage = increaseAndDecrease(image.heigh, image.width, referenceSheetFeatures.heigh, referenceSheetFeatures.width, true);

        }else {

            if (image.width < referenceSheetFeatures.width || image.heigh < referenceSheetFeatures.heigh) {
                percentage = increaseAndDecrease(image.heigh, image.width, referenceSheetFeatures.heigh, referenceSheetFeatures.width, false);
            }

        }

        return percentage;
    }

    public static double increaseAndDecrease(double imageHeigh, double imageWidth, double referenceHeigh, double referenceWidth, Boolean increase) {
        double widthCounter = imageWidth;
        double heighCounter = imageHeigh;
        double percentage = 0.0;


        if (increase) {

            while (widthCounter < referenceWidth || heighCounter < referenceHeigh) {
                if (widthCounter < referenceWidth) {
                    widthCounter = widthCounter + 0.1;

                }
                if (heighCounter < referenceHeigh) {

                    heighCounter = heighCounter + 0.1;

                }



            }
        } else {

            while (widthCounter > referenceWidth || heighCounter > referenceHeigh) {
                if (widthCounter > referenceWidth) {
                    widthCounter = widthCounter - 0.1;


                }
                if (heighCounter > referenceHeigh) {
                    heighCounter = heighCounter - 0.1;

                }
            }
        }


        if (widthCounter > heighCounter) {
            percentage = (widthCounter / imageWidth);
        } else {
            if (widthCounter < heighCounter) {
                percentage = (heighCounter / imageHeigh);
            } else {

                if (widthCounter == heighCounter) {
                    percentage = (heighCounter / imageHeigh);
                }
            }
        }

        return percentage;
    }




}
