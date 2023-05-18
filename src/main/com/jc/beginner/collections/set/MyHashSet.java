package main.com.jc.beginner.collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class MyHashSet {
    public static void main(String[] args) {
        //10,20,30,40,50..

        HashSet<Integer> hashSet = new HashSet<>();
        System.out.println(hashSet); //[]
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(50);
        hashSet.add(60);
        hashSet.add(10);
        hashSet.add(20);

        System.out.println(hashSet);//[10,20,30,40,50,60]

        //traverse..
        //iterator..
        System.out.println("using iterator");
       Iterator<Integer> itr =  hashSet.iterator();
       while(itr.hasNext()) {
           System.out.println(itr.next());
       }

        System.out.println(hashSet.size()); //6
        System.out.println(hashSet.contains(20)); //true
    }
}
