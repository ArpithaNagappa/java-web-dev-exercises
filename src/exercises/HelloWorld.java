package exercises;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        Scanner input;
        String  name;

        input = new Scanner(System.in);
        System.out.println("Hello,What is your name");
        name =input.nextLine();
        System.out.println("Hello " + name);
        input.close();

    }
}
