package main.com.jc.beginner.simple_interview_programs;

public class ReverseString {

    public String reverseString(String input) {

        System.out.println("Input string is " + input);

        char[] chars = input.toCharArray();
        String output = "";

        for(int i=chars.length-1; i >=0; i--) {
           output =  output + chars[i];
        }

        return  output;


    }
}
