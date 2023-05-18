package main.com.jc.beginner.basics.fundamentals;

public class BasicClass {

    //Primitive data types
    private byte byteData;
    private short shortData;
    private char charDate;
    private boolean boolData;
    private int intData;
    private long longData;
    private double doubleData;
    private float floatData;

    public void methodWithNoReturn()  {

        System.out.println("Method With No Return Type");
    }

    public int methodWithReturnTypeInt()  {
        System.out.println("Method With Return Type int");
        return 3;
    }

    public long methodWithNoReturnTypeLong()  {

        System.out.println("Method With Return Type long");
        return 3L;
    }

    public double methodWithNoReturnTypeDouble()  {
        System.out.println("Method With Return Type double");
        return 3.0;
    }

    public char methodWithNoReturnTypeChar()  {
        System.out.println("Method With Return Type char");
        return 'c';
    }

    public  byte methodWithNoReturnTypeByte()  {
        System.out.println("Method With Return Type byte");
        return 2;
    }

    public short methodWithNoReturnTypeShort()  {
        System.out.println("Method With Return Type short");
        return 3;
    }

}
