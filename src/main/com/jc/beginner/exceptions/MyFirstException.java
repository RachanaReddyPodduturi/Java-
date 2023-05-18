package main.com.jc.beginner.exceptions;

import main.com.jc.beginner.exceptions.customExceptions.CustomCheckedException;
import main.com.jc.beginner.exceptions.customExceptions.CustomUnCheckedException;

import java.io.*;

public class MyFirstException {

    public static void main(String[] args)  {
      // exception_example_one();
      // exception_example_two();
      //  exception_example_three();
      // exception_example_four();
       // exception_example_five();

      // checked_exception_thrown_example();
     exception_example_six(5);

    //  exception_example_seven(100);

    }
    public static void exception_example_one() {
        System.out.println("This is unchecked exception");
        int a = 30;
        int b = 20;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a/0); // Arithmetic Exception is thrown..

        System.out.println(a%b);
        System.out.println(a*2+ b* 3);

        /**
         *  Console:
         *  -----------
         *  This is unchecked exception
         *  50
         *  10
         *  600
         *  1
         *  AE /Zero at 29 exception_example_one
         *       main() MyFirstException.
         *
         *
         *
         *
         *
         */
    }
    public static void exception_example_two() {
        System.out.println("This is unchecked exception");
        int a = 30;
        int b = 20;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        try {
            System.out.println(a/0);
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic exception raised, result can't be printed!!!");
        }

        System.out.println(a%b); //30%20  - 10
        System.out.println(a*2+ b* 3);

        /**
         * This is unchecked Exception
         * 50
         * 10
         * 600
         * 1
         * Arithmetic exception raised, result can't be printed!!!
         * 10
         * 120
         *
         */
    }
    public static void exception_example_three() {
        System.out.println("This is checked exception");

       // FileReader fi = new FileReader("days.txt");
     }
    public static void exception_example_four() {
        System.out.println("This is checked exception");
        try {
            File file = new File("C:\\Courses\\Java\\Java-Beginner\\Programs\\java-beginner-programs\\src\\main\\resources\\days1.txt");
            FileReader fi = new FileReader(file);
            BufferedReader br = new BufferedReader(fi);
            br.lines().forEach(line -> System.out.println(line));
        } catch (FileNotFoundException ex) {
            System.out.println("File not present at the given location  - "+ ex);
        } catch (IOException ex) {
            System.out.println("IO Exception was thrown" + ex);
        }
    }
    public static void exception_example_five() throws Exception {
           System.out.println("This is checked exception");

            File file = new File("C:\\Courses\\Java\\Java-Beginner\\Programs\\java-beginner-programs\\src\\main\\resources\\days.txt");
            FileReader fi = new FileReader(file);
            BufferedReader br = new BufferedReader(fi);
            br.lines().forEach(line -> System.out.println(line));
    }
    public static void exception_example_six(int input)  {
        switch (input) {
            case 1:
                System.out.println("Input passed is 1");
                break;
            case 2:
                System.out.println("Input passed is 2");
                break;
            case 3:
                System.out.println("Input passed is 3");
                break;
            default:
                System.out.println("Invalid input provided");
                throw new CustomUnCheckedException("Since user passed invalid input, throwing new Custom Exception");
        }
    }
    public static void exception_example_seven(int input) throws CustomCheckedException {
        switch (input) {
            case 1:
                System.out.println("Input passed is 1");
                break;
            case 2:
                System.out.println("Input passed is 2");
                break;
            case 3:
                System.out.println("Input passed is 3");
                break;
            default:
                System.out.println("Invalid input provided");
                throw new CustomCheckedException("Since user passed 100, throwing new Custom Exception");

        }
    }
    public static void checked_exception_thrown_example() {
        System.out.println("Exception is handled here");
        try {
            exception_example_five();
        } catch (Exception ex) {
            System.out.println("Exception thrown");
        }

    }





}
