package main.com.jc.beginner.basics.fundamentals;

public class MethodOverloading {

    public void methodOverloading() {
        System.out.println("method overloading example ");
    }

    public void methodOverloading(String input) {
        System.out.println("method overloading example 2 - "+ input);
    }

    public void methodOverlaoding(String input, String input2) {
        System.out.println("method overloading example 3 - "+ input + " -- "+ input2 );
    }

    public void methodOverlaoding(String input, int input2) {
        System.out.println("method overloading example 3 - "+ input + " -- "+ input2 );
    }
}
