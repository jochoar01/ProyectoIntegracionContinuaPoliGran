import Controlers.AdaptationSize;
import Controlers.ImageManagement;
import models.Image;
import models.ReferenceSheetFeatures;

import static Controlers.SizeManagement.calculatePercentage;
import static Controlers.SizeManagement.increaseAndDecrease;

public class execute {

    public static void main(String[] args) {
        ImageManagement imageManagement = new ImageManagement();
        imageManagement.copyImage("C:\\Users\\juan.ochoa\\Desktop\\pruebaIMG\\Nueva.jpg", "C:\\Users\\juan.ochoa\\Desktop\\pruebaIMG\\copia\\copia.jpg", 1123, 796);
        Image image = new Image(200,500);
        ReferenceSheetFeatures referenceSheetFeatures = new ReferenceSheetFeatures(1123, 796);
       Double porcentaje =increaseAndDecrease(image.heigh,image.width,referenceSheetFeatures.heigh,referenceSheetFeatures.width,true);
        System.out.println(porcentaje);
       // System.out.println( "Porcentaje "+calculatePercentage(image,referenceSheetFeatures));
        System.out.println("__________________________________________________");
        System.out.println("Medidas de referencia A4 Alto: "+referenceSheetFeatures.heigh+" Ancho: "+referenceSheetFeatures.width);
        System.out.println("__________________________________________________");
        System.out.println("Medidas actuales imagen: "+image.heigh+" Ancho: "+image.width);
        System.out.println("__________________________________________________");
        System.out.println("Porcentaje permitido a escalar imagen " + (100.0)*porcentaje+"%");
        System.out.println("__________________________________________________");
        System.out.println("Nuevas medidas: Alto "+image.heigh*porcentaje+" Ancho "+image.width*porcentaje);
        System.out.println("__________________________________________________");

    }
}

