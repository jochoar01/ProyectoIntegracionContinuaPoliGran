package Controlers;

import models.ReferenceSheetFeatures;
import models.Image;

import static Controlers.SizeManagement.calculatePercentage;

public class AdaptationSize {






    public static String orientationValidator(Image image) {
        String orientation;
        if (image.heigh > image.width) {
            orientation = "vertical";
        } else {
            if (image.heigh < image.width) {
                orientation = "horizontal";
            } else {
                orientation = "square";
            }
        }
        return orientation;
    }

    public double executeSizeCalculation(Image image, ReferenceSheetFeatures referenceSheetFeatures) {

        return 1+calculatePercentage(image,referenceSheetFeatures);

    }
}
