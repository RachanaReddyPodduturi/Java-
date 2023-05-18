package main.com.jc.beginner.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MyHashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Google"); // -> Entry
        hashMap.put(2, "Microsoft");
        hashMap.put(3, "Nvidia");
        hashMap.put(4, "Facebook");
        hashMap.put(5, "Apple");
        hashMap.put(6, "Tesla");

        //traverse a hashMap
        Set<Map.Entry<Integer, String >> entrySet = hashMap.entrySet();
       Iterator<Map.Entry<Integer, String >> iterator =  entrySet.iterator();

       while(iterator.hasNext()) {
           Map.Entry<Integer, String> entry = iterator.next();
           System.out.println(entry.getKey());
           System.out.println(entry.getValue());
       }

       // keyset
        Set<Integer> hashSet = hashMap.keySet();
        for(Integer key: hashSet) {
            System.out.println(key + " --- " + hashMap.get(key));
        }

        //remove an element
        hashMap.remove(1);

        System.out.println(hashMap);

        //contains key & value

        System.out.println(hashMap.containsKey(3));
        System.out.println(hashMap.containsValue("Google"));
    }
}
