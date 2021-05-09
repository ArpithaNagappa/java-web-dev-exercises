package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.Scanner;

public class ArrayListExercise {
    public static void main(String[] args) {

        // Allow for at most 30 students
        int maxNumbers = 20;

        int[] numbersList = new int[maxNumbers];
        String[] stringList = new String[maxNumbers];
        numbersList[0]=1;
        numbersList[1]=2;
        numbersList[2]=3;
        numbersList[3]=4;
        numbersList[4]=5;
        numbersList[5]=6;
        numbersList[6]=7;
        numbersList[7]=8;
        numbersList[8]=9;
        numbersList[9]=10;
        numbersList[10]=12;
        int sumNums = sumNumbers(numbersList);

        System.out.println("Sum of numbers: "+sumNums);

        stringList[0]="five";
        stringList[1]="fifth";
        stringList[2]="sixth";
        stringList[3]="ton";
        stringList[4]="running";

        for (String str_arr : stringList) {
            if(str_arr != null) {
                if (retWords(str_arr))
                    System.out.println("Yes it is a five letter word: " + str_arr);
            }
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of letters: ");
        String len = input.nextLine();

        for (String str_arr : stringList) {
            if(str_arr != null) {
                if (retWordsNum(str_arr,Integer.parseInt(len)))
                    System.out.println("Yes it is a "+len+" letter word: " + str_arr);
            }
        }
    }

    public static int sumNumbers(int[] arg1){
        int returnNum = 0;
        for (int num_arr : arg1) {
            if(num_arr%2==0)
                returnNum+=num_arr;
        }
        return returnNum;
    }

    public static boolean retWords(String arg1){
        if(arg1.length()==5)
            return true;
        else return false;
    }

    public static boolean retWordsNum(String arg1,int len){
        if(arg1.length()==len)
            return true;
        else return false;
    }
}
