package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountingCharacters {
    public static void main(String[] args) {
        String txt = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = txt.toCharArray();
        boolean charExists = false;

        HashMap<Character, Integer> charlist = new HashMap<>();

        for (char str_arr : charactersInString) {
            int char_len = 0;
            charExists = false;
            for (char str_arr1 : charactersInString) {
                if(str_arr==str_arr1)
                {
                    char_len+=1;
                }
            }
            //System.out.println(str_arr+": "+char_len);
            for (Map.Entry<Character,Integer> entry : charlist.entrySet())
            {
                if(entry.getKey() == str_arr)
                {
                    charExists = true;
                    //break;
                }
            }
            if(!charExists)
                charlist.put(str_arr, char_len);
        }

        for (Map.Entry<Character,Integer> entry : charlist.entrySet())
        {
            System.out.println(entry.getKey() +": " + entry.getValue());
        }
    }
}
