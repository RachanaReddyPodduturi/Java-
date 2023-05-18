package main.com.jc.beginner.oops.encapsulation;

public class EncapsulationTestMain {

    public static void main(String[] args) {

        EncapsulationTest encapsulationTest = new EncapsulationTest();
       // System.out.println(encapsulationTest.name); //null
       // System.out.println(encapsulationTest.id); // 0
       // System.out.println(encapsulationTest.email); //null


        // "xyz", 1, "xyz@gmail.com"

        EncapsulationTest encapsulationTest1 = new EncapsulationTest("xyz", 1, "xyz@gmail.com");
        // System.out.println(encapsulationTest.name); //xyz // read/get
        // System.out.println(encapsulationTest.id); // 1
        // System.out.println(encapsulationTest.email); //xyz@gmail.com

       // encapsulationTest1.name = "abc";  // set

        System.out.println( encapsulationTest1.getName());
        System.out.println( encapsulationTest1.getId());
        System.out.println( encapsulationTest1.getEmail());



        System.out.println("-----------doing modification-------------");

        System.out.println( encapsulationTest1.getName());
        System.out.println( encapsulationTest1.getId());
        System.out.println( encapsulationTest1.getEmail());













    }
}
