package me.jacobwiltshire;

public class Main {

    public static void main(String[] args) {
	calcFeetAndInchesToCentimetres(10, 12);
    }



    public static double calcFeetAndInchesToCentimetres(double feet, double inches) {
        if ((feet < 0) || ((inches > 0) && (inches >12))) {
            System.out.println("invalid");
            return -1;
        }

        double centimetres = (feet * 12) * 2.54;
        centimetres += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimetres + "cm");
        return centimetres;
    }
}
