package main.com.jc.beginner.basics.conditionals_and_loops;

public class SwitchCase {

    public void switchCase_example_one(int input) {
        switch (input) {
            case 1:
                System.out.println("Print 1");
                break;
            case 2:
                System.out.println("Print 2");
                break;
            case 3:
                System.out.println("Print 3");
                break;
            default:
                System.out.println("Print default");
        }
  }

    public void switchCase_example_two(int input) {
        switch (input) {
            case 1:
                System.out.println("Print 1");
            case 2:
                System.out.println("Print 2");
            case 3:
                System.out.println("Print 3");
            default:
                System.out.println("Print default");
        }
    }

    public void switchCase_example_three(int input) {
        switch (input) {
            case 1:
            case 2:
                System.out.println("Print 1 or 2");
                break;
            case 3:
                System.out.println("Print 3");
            default:
                System.out.println("Print default");
        }
    }
}
