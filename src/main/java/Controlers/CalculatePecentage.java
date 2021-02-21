package Controlers;


public class CalculatePecentage {


    public static double calculatePercentage(double side, double ref) {
        System.out.println("Side "+(int)side+" Reference "+(int)ref);
        double percentage = 0;
        if ((int)side < (int)ref) {
            percentage = increase(side, ref);
        } else {
            if ((int)side > (int)ref) {
                percentage = decrease(side, ref);
            }
        }
        return percentage;
    }


    private static double increase(double side, double ref) {
        System.out.println("Se debe Aumentar");
        double percentage = (((ref - side) / side) + 1);
        System.out.println("Porcentaje de aumento "+percentage);
        return percentage;
    }

    private static double decrease(double side, double ref) {
        System.out.println("Se debe Disminuir");
        double diference = side - ref;
        double percentage = (1 - (diference / side));
        System.out.println("Porcentaje de disminucion "+percentage);
        return percentage;
    }





}
