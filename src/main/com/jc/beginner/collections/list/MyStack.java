package main.com.jc.beginner.collections.list;

import java.util.Iterator;
import java.util.Stack;

/**
 *  Push() - to push elements into stack
 *  Pop() - to retrieve elements from stack
 *  Peek() - to see the element on top of the stack
 */
public class MyStack {
    public static void main(String[] args) {

        Stack<String> names = new Stack<>(); //add // addElement //--  push
        names.add("Apple");
        names.add("Facebook");
        names.add("Google");
        names.add("Netflix");
        names.add("Microsoft");
        names.add("Nvidia");
        names.addElement("Visa");

        Iterator<String> itr =  names.iterator();
        while(itr.hasNext()) {
            String name = itr.next();
            System.out.println(name);
        }

        System.out.println("Size - "+ names.size());
        System.out.println("capacity - "+names.capacity()); //10 --> 8 --> 20
        System.out.println("index - "+names.indexOf("Visa"));

        if(names.contains("Microsoft")) {
            System.out.println("present in list");
        } else {
            System.out.println("Not present in list");
        }


        /**
         * Stack Methods:
         */

        names.push("Apple1");
        names.push("Facebook1");

        System.out.println(names.push("Microsoft1"));

        names.pop();
        System.out.println(names.pop());

        System.out.println(names.peek());
    }
}
