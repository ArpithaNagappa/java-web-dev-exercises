package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExercise {
    public static void main(String[] args) {

        HashMap<String, Double> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and id
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("Id: ");
                Double newId = input.nextDouble();
                students.put(newStudent, newId);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (Map.Entry<String, Double> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
            sum += student.getValue();
        }

        //double avg = sum / students.size();
        //System.out.println("Average grade: " + avg);
    }
}
