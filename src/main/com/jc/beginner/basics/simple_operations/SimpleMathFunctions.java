package main.com.jc.beginner.basics.simple_operations;

import main.com.jc.beginner.basics.constructor.Constants;

public class SimpleMathFunctions {

    public static int areaOfRectangle(int length, int breadth) {
        return length * breadth;
    }

    public static int areaOfSquare(int side) {
        return side * side;
    }

    public static float areaOfACircle(int radius) {
        return Constants.PI * radius * radius;
    }
}
