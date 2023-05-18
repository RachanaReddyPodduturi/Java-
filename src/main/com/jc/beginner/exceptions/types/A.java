package main.com.jc.beginner.exceptions.types;

import main.com.jc.beginner.exceptions.customExceptions.CustomCheckedException;

public class A {

    public void method1_a() {
        System.out.println("+++++++line 6 - method1 of A+++++++++");
    }

    public void method2_a() {
        System.out.println(22/0);
    }

    public void method3_a(int a) throws CustomCheckedException  {
        switch (a) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
             default:
                 System.out.println("Invalid day entered");
                 throw new CustomCheckedException("Invalid day Entered");
        }
    }
}
