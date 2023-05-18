package main.com.jc.beginner.collections.list;

import java.util.Iterator;
import java.util.Vector;

public class MyVector {
    public static void main(String[] args) {

        Vector<String> names = new Vector<>();
        names.add("Apple");
        names.add("Facebook");
        names.add("Google");
        names.add("Netflix");
        names.add("Microsoft");
        names.add("Nvidia");


        System.out.println(names); //[Apple, Facebook, Google, Netflix, Microsoft, Nvidia]

       Iterator<String> itr =  names.iterator();
       while(itr.hasNext()) {
           String name = itr.next();
           System.out.println(name);
       }

        System.out.println("Size - "+ names.size()); //6
        System.out.println("capacity - "+names.capacity()); //10
        System.out.println("index - "+names.indexOf("Visa"));

        if(names.contains("Microsoft")) {
            System.out.println("present in list");
        } else {
            System.out.println("Not present in list");
        }

    }
}
