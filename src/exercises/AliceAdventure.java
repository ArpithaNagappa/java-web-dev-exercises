package exercises;

import java.util.Scanner;

public class AliceAdventure {
    public static void main(String[] args){
        Scanner input;
        String text;
        String str = "Alice was beginning to get very tired of sitting by her sister on the bank,and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        input = new Scanner(System.in);
        System.out.println("enter the text to be search");
        text =input.nextLine();

       String input1 = text.toLowerCase();
        String str1 = str.toLowerCase();


        if(str1.contains(input1) ) {
            System.out.println("text found");
            System.out.println (str.indexOf(input1));
            System.out.println (input1.length());
            System.out.println (str.replace(text ,""));

        }
            else {
                System.out.println("text not found");
                 }

        }


}
