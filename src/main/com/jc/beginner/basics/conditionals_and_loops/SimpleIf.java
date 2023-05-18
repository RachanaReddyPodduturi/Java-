package main.com.jc.beginner.basics.conditionals_and_loops;

public class SimpleIf {

   public void simpleIf_example_one(){
       boolean value = 0<10; // true
       if(value) {
           System.out.println("0 is less than 10");
       }
   }

    public void simpleIf_example_two(){

        if(-10 > 0) {
            System.out.println("-10 is less than 0");
        }
        //
    }

    public void simpleIf_example_three() {
       boolean value = false;
       if(value)
           System.out.println("he he, I got printed!!");

           System.out.println("will I be printed ?????");
    }

    public void simpleIf_example_four() {
       boolean value = false;
       if(!value)
           System.out.println("Yes, even I am false, I got printed ...:) :)");

       value = true;

       if(value)
           System.out.println("Will I be printed ?????????");
    }

    public void simpleIf_example_five() {
       boolean value = true;
       if(value == true)
           System.out.println("Yes!! Printed");

       if(value=false) // false
           System.out.println("Will I be printed ????????");
    }

    public void simpleIf_example_six() {
        boolean value = false;
        if(value == true)
            System.out.println("Yes!! Printed");

        if(value=true)
            System.out.println(" :) :), that's how I work");
    }

}
