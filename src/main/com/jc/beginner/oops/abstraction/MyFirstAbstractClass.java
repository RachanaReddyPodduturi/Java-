package main.com.jc.beginner.oops.abstraction;

public abstract class MyFirstAbstractClass {

    public int data1;

    public String data2;

    public String data3;

    public MyFirstAbstractClass(){

    }

    public MyFirstAbstractClass(int a, String b, String c) {
        this.data1 = a;
        this.data2 = b;
        this.data3 = c;
    }

    public abstract void method1();

    public abstract void method2();

    public abstract void method3();
}



