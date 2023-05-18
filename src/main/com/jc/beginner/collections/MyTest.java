package main.com.jc.beginner.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class MyTest {
    //ArrayList -> 10,20,30 --> print ..for each and iterator
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,40,50}; //array -- for loop
        for(int i=0; i < arr.length; i++) {
            System.out.println(arr[i]); //arr[0] -10  //arr[1] - 20 //arr[2] - 30 // arr[3] - 40 // arr[4] - 50
        }

        ArrayList<Integer> arrayList  = new ArrayList();
        System.out.println(arrayList);

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        System.out.println(arrayList);


        //traverse ..
        //for-each
        for( Integer i: arrayList) {
            System.out.println(i);
        }

        System.out.println("using iterator ");
        // iterator()
       Iterator<Integer> itr =  arrayList.iterator();
        //hasNext -> next element present or not -> true / false
        //next
        //remove
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }





    }
}
