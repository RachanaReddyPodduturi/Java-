package main.com.jc.beginner.oops.abstraction;

public abstract class ImplementationClass extends  MyFirstAbstractClass{

    public int data4;

    public ImplementationClass() {
    }

    public ImplementationClass(int d) {
        this.data4 = d;
    }

    public ImplementationClass(int a, String b, String c, int d) {
        super(a, b, c);
        this.data4 = d;
    }

    public void method1() {
        System.out.println("In method1");
    }

    public void method3() {
        System.out.println("In method3");
    }

    public abstract void method2();
}
