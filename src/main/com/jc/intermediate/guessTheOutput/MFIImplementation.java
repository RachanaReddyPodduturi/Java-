package main.com.jc.intermediate.guessTheOutput;

import java.util.Arrays;
import java.util.List;

public class MFIImplementation {
    public static void main(String[] args) {

        MFI mfi = () -> System.out.println("Java");
        List<Integer> numbers = Arrays.asList(10,20,30,40,50,60,70,80,90);
        System.out.println(numbers);
        System.out.println(numbers.toString());

       // numbers.add(20); //UnsupportedOperationException -- Its only fixed size by default

        numbers.set(0,20);
        System.out.println(numbers);

        mfi.abstractMethod();



        numbers.stream().forEach(System.out::println);

    }
}
