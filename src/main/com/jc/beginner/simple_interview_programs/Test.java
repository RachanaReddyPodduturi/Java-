package main.com.jc.beginner.simple_interview_programs;

public class Test {
    public static void main(String[] args) {

        String name = "advanced";

        char[] characters = name.toCharArray();
        int length = characters.length;

        for(int i=0; i < length; i++) {
            System.out.println(characters[i]);
        }

        System.out.println("------------------------");
        // print these in reverse way..
        for(int i = length-1;  i>=0 ; i--) {
            System.out.println(characters[i]);
        }

        //............................................
        //ASCII for

        System.out.println('A' + 0); // 65


        System.out.println((char)('A' + 32)); //65 + 32 = 97
        System.out.println( (char)('b'-32));


        for(int i=0; i < length; i++) {

            System.out.println(characters[i]);
        }




    }

}
