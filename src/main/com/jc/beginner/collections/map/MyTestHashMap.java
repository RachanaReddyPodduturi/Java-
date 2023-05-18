package main.com.jc.beginner.collections.map;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MyTestHashMap {
    public static void main(String[] args) {

        HashMap<Integer, String>  hashMap = new HashMap<>();
        System.out.println(hashMap); //{}
        hashMap.put(10, "One");
        hashMap.put(20, "Two");
        hashMap.put(30, "Three");
        hashMap.put(40, "Four");
        hashMap.put(50, "Five");
        System.out.println(hashMap); //keys - 1,2,3,4,5  //value - one, two, three,four,five

     Set<Map.Entry<Integer, String>> entrySet =   hashMap.entrySet();

     Iterator<Map.Entry<Integer, String>> itr =  entrySet.iterator();
     while(itr.hasNext()) {

       Map.Entry<Integer,String> entry =   itr.next();
         System.out.println(entry);

     }
        Set<Integer> keySet = hashMap.keySet();

     // iterate it using the ketset..
        for(Integer i : keySet) {
            System.out.println(i); // keys
            System.out.println(hashMap.get(i)); //values
        }




    }
}
