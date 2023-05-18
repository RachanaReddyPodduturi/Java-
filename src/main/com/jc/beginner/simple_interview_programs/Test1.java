package main.com.jc.beginner.simple_interview_programs;

public class Test1 {
    public static void main(String[] args) {

        String name = "madam"; //madam

        String reverseName = ""; // a ab abc abcd abcdc abcdcb abcdcba

        //  reverse of  a String
        // char[]..

        char[] chars =   name.toCharArray();
        for(int i =chars.length-1; i>=0; i--) {
            reverseName = reverseName+chars[i];
        }

        if(name.equals(reverseName)) {
            System.out.println("Given input is palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

    }
}
