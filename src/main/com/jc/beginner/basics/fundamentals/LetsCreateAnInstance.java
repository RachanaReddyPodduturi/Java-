package main.com.jc.beginner.basics.fundamentals;

public class LetsCreateAnInstance {

    public static void main(String[] args) {

        MyFirstClass myFirstClass = new MyFirstClass();

        System.out.println("sum " + myFirstClass.sum());
        System.out.println("difference " + myFirstClass.difference());
        System.out.println("multiplication " + myFirstClass.multiplication());
    }
}
