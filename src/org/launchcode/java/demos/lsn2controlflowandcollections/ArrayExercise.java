package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.Arrays;

public class ArrayExercise {
    public static void main(String[] args ) {
        double[] num_array = {1, 1, 2, 3, 5, 8};
        String big_text = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        /*for (double num_arr : num_array) {
            System.out.println(num_arr);
        }*/

        for (double num_arr : num_array) {
            if(num_arr%2!=0)
            System.out.println(num_arr);
        }

        String[] array = big_text.split("\\ ");

        System.out.println(Arrays.toString(array));

        String[] array1 = big_text.split("\\.");

        System.out.println(Arrays.toString(array1));
    }
}
