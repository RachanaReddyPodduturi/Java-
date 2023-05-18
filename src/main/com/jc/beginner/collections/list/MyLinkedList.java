package main.com.jc.beginner.collections.list;

import main.com.jc.beginner.collections.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {

        LinkedList<Student> studentsLinkedList = new LinkedList<>();

        // 1, a, a@gmail, CS
        Student s1 = new Student(1,"a" ,"a@gmail", "CS");
        Student s2 = new Student(2,"b" ,"b@gmail", "DA");
        Student s3 = new Student(3,"c" ,"c@gmail", "CS");
        Student s4 = new Student(4,"d" ,"d@gmail", "BA");
        Student s5 = new Student(5,"e" ,"e@gmail", "CS");

        studentsLinkedList.add(s1);
        studentsLinkedList.add(s2);
        studentsLinkedList.add(s3);
        studentsLinkedList.add(s4);
        studentsLinkedList.add(s5);

        //traverse.. // print all the students whose major is CS
        Iterator<Student> itr = studentsLinkedList.iterator();
        while(itr.hasNext()) {
            Student s = itr.next();
            if(s.getMajor().equals("CS")) {
                System.out.println(s);
            }
        }











    }
}
