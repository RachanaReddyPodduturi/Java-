package main.com.jc.beginner.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class MyLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String>  linkedHashSet = new LinkedHashSet<>();
        System.out.println(linkedHashSet);//[]
        linkedHashSet.add("Google");
        linkedHashSet.add("Microsoft");
        linkedHashSet.add("Chase");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Tesla");
        linkedHashSet.add("Tesla");

        System.out.println(linkedHashSet); //[]
        System.out.println(linkedHashSet.size()); //5

        //iterator..
       Iterator<String> itr = linkedHashSet.iterator();
       while(itr.hasNext()) {
           System.out.println(itr.next());
       }


    }
}
