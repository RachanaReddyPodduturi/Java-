package main.com.jc.beginner.basics.simple_operations;

public class SimpleOperations {

    public static int addition(int a, int b) {
        return a+b;
    }

    public static int subtraction(int a, int b) {
        return a-b;
    }

    public static int multiplication(int a, int b) {
        return a*b;
    }

    public static int division(int a, int b) {
        return a/b;
    }

    public static int modulo(int a, int b) {
        return a%b;
    }

    public int increment(int number) {
       // number = number +
        number++;
        return number;
    }

    public int decrement(int number) {
        number = number -1;
        return number;
    }

    public boolean logicalOr(boolean a, boolean b) {
        return a || b;
    }

    public boolean logicalAnd(boolean a, boolean b) {
        return a && b;
    }

    public boolean logicalNegate(boolean a) {
        return !a;
    }

    public boolean logicalXOR(boolean a, boolean b) {
        return a^b;
    }
}
