package main.com.jc.beginner.basics.arrays;

public class ArrayBasics {

    public void arrayBasics_example_one() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Length of an array is - " +numbers.length);
        System.out.println(numbers[8]); // 9
    }

    public void arrayBasics_example_two() {
        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 6;
        numbers[6] = 7;
        numbers[7] = 8;
        numbers[8] = 9;
        numbers[9] = 10;

        System.out.println("Length of an array is - " + numbers.length);
    }

    public void arrayBasics_example_three() {
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        System.out.println("Length of an array is - "+ numbers.length); //5
        System.out.println("Elements at index 2 is - "+ numbers[2]); //3
    }

    public void arrayBasics_example_four() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int length = numbers.length; //10
        for(int i= 0; i< length; i++) {
            System.out.println(numbers[i]);
            // numbers[0] - 1
            // numbers[1] - 2
            // numbers[2] - 3
            // numbers[3] - 4
            // numbers[4] - 5
            // numbers[5] - 6
            // numbers[6] - 7
            // numbers[7] - 8
            // numbers[8] - 9
            // numbers[9] - 10
        }
    }

    public void arrayBasics_example_five(String input) {
        char[]  characters = input.toCharArray(); //'j','a','v','a'
        int length = characters.length; // 4

        for(int i=0; i < length; i++) {
            System.out.println(characters[i]);
        }
    }

    public void arrayBasics_example_six(String input) {
        String[]  words = input.split(" ");// "java","spring","hibernate","kafka","gcp","ocp"
        int length = words.length; // 6

        for(int i=0; i < length; i++) {
            System.out.println(words[i]);
        }
    }


}
