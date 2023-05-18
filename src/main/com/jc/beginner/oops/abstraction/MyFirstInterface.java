package main.com.jc.beginner.oops.abstraction;

public interface MyFirstInterface {

    public String method1();

    public void method2();

    public String method3();

    default  String method4() {

        return "";
    }

}
