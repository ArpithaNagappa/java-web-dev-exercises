package exercises;

import java.util.Scanner;

public class RectAngle {
    public static void main(String [] args){
        Scanner input;
        double width;
        double length;

        input= new Scanner(System.in);

        System.out.println("enter the length");
        length=input.nextDouble();

        System.out.println("enter the width");
        width=input.nextDouble();

        double area = width * length;
        System.out.println("Area of Rectangle" + area);
        input.close();


    }
}
