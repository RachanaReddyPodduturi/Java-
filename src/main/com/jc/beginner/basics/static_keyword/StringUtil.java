package main.com.jc.beginner.basics.static_keyword;

public class StringUtil {

    public static String reverse(String input) {
        String reverse = "";
        char[] charArray = input.toCharArray();

        for(int i= charArray.length-1; i >= 0; i--) {
            reverse = reverse + charArray[i];
        }

        return reverse;
     }



}