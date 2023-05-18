package main.com.jc.beginner.basics.constructor;
/*
 Create a class student with three attributes called:
    name - String
    rollNo - Id
    subjects - String

 // 3 Students:
   1. Hari, 1, "DSA, Java, DBMS"
   2. Jahnavi, 2, "DSA, Java, Adv OS"
   3. Nag, 3, "DSA, CP, NS"

    // whenever we create the instance, it should be initialized with these values..

 */
public class Student {
    public String name;
    public int rollNo;
    public String subjects;

   public Student(String name, int rollNo, String subjects  ) {
        this.name = name;
        this.rollNo = rollNo;
        this.subjects = subjects;
    }

    public Student() {

    }


    //access-specific --public/private
    // syntax: access-specifier returnType methodName() { };


    // return with "name, rollNo, subjects
    public String print() {
       return name + " "+ rollNo+ " " + subjects;
    }





}





