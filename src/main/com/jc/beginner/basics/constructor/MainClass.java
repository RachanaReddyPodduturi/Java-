package main.com.jc.beginner.basics.constructor;

public class MainClass {
    public static void main(String[] args) { // as is..

        Student s1 = new Student(); // created an instance
        System.out.println(s1.print()); // grabage values..

        Student s2 = new Student("RAM", 1, "Jav"); //created instance with parameterized..
        System.out.println(s2.print()); // RAM 1 Jav2


        StudentStatic ss = new StudentStatic(); // NOT required.
        System.out.println( ss.print()); //https://www.google.com


        System.out.println(StudentStatic.print()); //https://www.google.com


    }
}
