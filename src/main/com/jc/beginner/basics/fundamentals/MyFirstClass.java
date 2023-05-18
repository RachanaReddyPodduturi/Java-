package main.com.jc.beginner.basics.fundamentals;

/**
 *  A class is a template or blue-print. It consists of variables/properties
 *  and methods/functions.
 *
 */
public class MyFirstClass {
    // variables
    int x; //declaration
    int y ; //declaration
// <access-specifier> <return type> methodName() {}

    //methods
    public int sum() {
        return x+y;
    }

    public int difference() {
        return x-y;
    }

    public int multiplication() {
        return x*y;
    }

    public boolean testMethod() {
      return false;
    }

    public void noReturnForThisMethod() {

    }

    // default ..
    public MyFirstClass() {

    }

    public MyFirstClass(int x, int y) { //local variables..
        this.x = x;
        this.y = y;
    }

}
