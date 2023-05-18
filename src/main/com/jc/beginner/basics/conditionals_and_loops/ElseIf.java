package main.com.jc.beginner.basics.conditionals_and_loops;

public class ElseIf {

    public void elseIf_example_one() {
        int a = 30, b = 40;

        if(a < b) {
            System.out.println("a is smaller");
        } else if(a > b) {
            System.out.println("a is greater");
        } else {
            System.out.println("both are equals");
        }
    }

    public void elseIf_example_two() {
        int a = 30, b = 20;

        if(a < b) {
            System.out.println("a is smaller");
        } else if(a > b) {
            System.out.println("a is greater");
        } else {
            System.out.println("both are equals");
        }
    }

    public void elseIf_example_three() {
        int a = 30, b = 30;

        if(a < b) {
            System.out.println("a is smaller");
        } else if(a > b) {
            System.out.println("a is greater");
        } else {
            System.out.println("both are equals");
        }
    }
}
