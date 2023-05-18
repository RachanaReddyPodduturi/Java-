package main.com.jc.beginner.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {

        // Array creation and iteration (traversing array elements)
        int[] arr = new int[]{10, 20, 30, 40, 50};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("-------------ArrayList----------------");
        // ArrayList
        // ArrayList<Integer> arrayList1 = new ArrayList<>();

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(10);

        System.out.println("traversing elements using for-each loop");
        //traverse an array-list //for-each loop
        for (Integer i : arrayList) {
            System.out.println(i);
        }

        System.out.println("traversing elements using Iterator");

        Iterator<Integer> itr = arrayList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("size of an arrayList " + arrayList.size()); //5
        System.out.println(arrayList);

        System.out.println("check whether 10 is present in arrayList " + arrayList.contains(10)); //true

        System.out.println("removing an element from arrayList " + arrayList.remove(0));

    }
}

