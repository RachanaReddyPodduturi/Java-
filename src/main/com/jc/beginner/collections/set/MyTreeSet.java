package main.com.jc.beginner.collections.set;

import java.util.Iterator;
import java.util.TreeSet;

public class MyTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        System.out.println(treeSet); //[]
        treeSet.add(20);
        treeSet.add(10);
        treeSet.add(40);
        treeSet.add(60);
        treeSet.add(70);
        treeSet.add(30);
        treeSet.add(50);
        treeSet.add(10);

        System.out.println(treeSet); //


        //traverse..
        Iterator<Integer> itr = treeSet.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }



    }
}
