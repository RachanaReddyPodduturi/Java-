package main.com.jc.intermediate.functionalInterfaces;

import java.util.function.Function;
import java.util.function.Predicate;

public class MainClass {

    public static void main(String[] args) {

        MyInterfaceImpl myInterface = new MyInterfaceImpl();
        myInterface.m1();

        new MyInterfaceImpl().m1();

        FI1 fi1 = new FI1() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };

        System.out.println(fi1.add(2,3));

        System.out.println(fi1.add(10,30));

        FI1 fi2 =  (a,  b) ->  { return a + b;};
        System.out.println(fi1.add(3,6));

        Function<String, Integer> function = t -> t.length();
        System.out.println(function.apply("Java course"));

        Predicate<Integer> predicate = t -> t > 10;
        System.out.println(predicate.test(100));


    }
}
