package main.com.jc.beginner.basics.simple_operations;

public class SimpleOperationsMain {

    public static void main(String[] args) {

        //ctrl+D -> duplicate existing line..

        System.out.println(SimpleOperations.addition(10, 20));
      System.out.println(SimpleOperations.subtraction(20, 10));
      System.out.println(SimpleOperations.multiplication(20, 10)); //200
      System.out.println(SimpleOperations.division(20, 10)); //2
      System.out.println(SimpleOperations.modulo(20, 10)); //0


      SimpleOperations so = new SimpleOperations();
        System.out.println( so.increment(10)); //11

        System.out.println( so.decrement(10)); // 9

        System.out.println(so.logicalOr(true, true)); // true
        System.out.println(so.logicalAnd(true, false)); // false
        System.out.println(so.logicalNegate(true)); // false
        System.out.println(so.logicalXOR(false, true)); // true












    }
}
