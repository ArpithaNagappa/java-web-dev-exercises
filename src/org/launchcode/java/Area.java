package org.launchcode.java;

import org.launchcode.java.studios.areaofacircle.Circle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input;
        String r;
        double A;
        double rad;

        do {
            input = new Scanner(System.in);
            System.out.println("Enter the radius of the circle");
            r = input.nextLine();
        } while (!r.matches("[0-9]+"));
        rad = Double.parseDouble(r);

        double area = Circle.getArea(rad);
        System.out.println("Area of Circle  " + area);
       /* rad = Double.parseDouble(r);
        double pi = Math.PI;
        A =pi * rad * rad;
        System.out.println("Area of Circle  " + A);
        input.close();*/


    }
}
