package main.com.jc.beginner.basics.fundamentals;

public class MainClass {

    public static void main(String[] args) {
        System.out.println(returnMyLength("Java"));

        MainClass mainClass = new MainClass();
        System.out.println(mainClass.converToLowerCase("Java"));
    }

    public static int returnMyLength(String input) {
        return input.length();
    }

    public String converToLowerCase(String input) {
        return input.toLowerCase();
    }
}
