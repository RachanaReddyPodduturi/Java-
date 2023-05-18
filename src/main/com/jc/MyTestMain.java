package main.com.jc;

import main.com.jc.intermediate.MyPredicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MyTestMain {

    public static void main(String[] args) {

        MyFirstFunctionalInterface mfi = new MyFirstFunctionalInterfaceImpl();
        System.out.println(mfi.add(10, 40)); //50

        MyFirstFunctionalInterface mfi1 = new MyFirstFunctionalInterface() {
            public int add(int a, int b) {
                return a+b;
            }
        };

        /**
         *
         * MethodName: add
         * return type: int
         *  args: int a, int b
         *  body: { return a+b; }
         *
         *
         */

        System.out.println(mfi1.add(20,30)); // 50

        MyFirstFunctionalInterface mfi2 =  (a, b) -> {return a+b;};

        System.out.println(mfi2.add(30,20)); //50


//---------------------------------------------------------------------
        MyPredicate p = (a) -> {
            if(a > 10) return true;
            else return false;
        };


        System.out.println(p.test(10)); // false
        System.out.println(p.test(30)); //true

        MyFunction function = (name) -> {
            return 2 * name.length();
        };

        System.out.println(function.apply("java")); //

        Predicate<Integer> evenNumber = e -> e%2 ==0;

        List<Integer> arrayList = Arrays.asList(10,20,32,15,35,36,37);

        System.out.println(processList(arrayList, evenNumber));

        System.out.println(processList(arrayList, e -> e%2!=0));



    }

    public static List<Integer> processList(List<Integer> list, Predicate<Integer> predicate) {

        List<Integer> list1 = new ArrayList<>();
        for(Integer i : list) {
            if(predicate.test(i)) {
                list1.add(i);
            }
        }
        return list1;
    }
}
