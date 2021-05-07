package exercises;

import java.util.Scanner;

public class MilepGallon {
    public static void main(String [] args){
        double gas;
        double distance;
        double mPg;
        Scanner input;

        input= new Scanner(System.in);

        System.out.println("enter the number of miles driven");
        distance =input.nextDouble();

        System.out.println("enter the amount of gas");
        gas =input.nextDouble();

        mPg= distance/gas;
        System.out.println("miles per gallon is "  +  mPg);
        input.close();
    }
}
