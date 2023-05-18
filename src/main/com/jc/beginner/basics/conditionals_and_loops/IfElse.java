package main.com.jc.beginner.basics.conditionals_and_loops;

public class IfElse {

    public void ifElse_example_one() {
        boolean value = 10 < 20; // true
        if(value) {
            System.out.print("if block");
        } else {
            System.out.println("else block");
        }
    }

    public void ifElse_example_two() {
        boolean value = false;
        if(value) {
            System.out.print("if block");
        } else {
            System.out.println("else block");
        }
    }

    public void ifElse_example_three() {
        float a = 100; //0.5
        float b = 200;
        float c = a/b;
        boolean value = c > 0;

        if(value) {
            System.out.print("if block");
            value = false;
        } else
            System.out.println("else block");

        System.out.println(value);
    }

    public void ifElse_example_four() {
        int a = 100;
        int b = 200;
        boolean value = a/b < 0; // false
        if(value)
            System.out.print("if block");
         else
            System.out.println("else block");

            value = true;

        System.out.println(value); // true..
    }



}
