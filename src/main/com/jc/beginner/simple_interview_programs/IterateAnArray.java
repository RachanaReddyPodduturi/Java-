package main.com.jc.beginner.simple_interview_programs;

public class IterateAnArray {

    public static void main(String[] args) {

        // declare an array: initialize it with 1- 10;
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i =0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

        String name = "java";
        //j
        //a
        //v
        //a

        char[] chars =  name.toCharArray();
        int length = chars.length;

        for(int i =0; i<length; i++) {
            System.out.println(chars[i]);
        }

        //a
        //v
        //a
        //j

        for(int i =length - 1; i>=0; i--) {
            System.out.println(chars[i]);
        }









    }




}
