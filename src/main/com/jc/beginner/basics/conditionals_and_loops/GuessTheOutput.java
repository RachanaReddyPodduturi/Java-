package main.com.jc.beginner.basics.conditionals_and_loops;

public class GuessTheOutput {
    public int simpleIf_gto_one(int value) {
        if(value < 0) {
            value = value + 20;
        }
            value++;

            return value;
    }

    public String simpleIf_gto_two(int value) {
        if(value > 10)
            if(value < 10)
              return "m>10";
            else
                return "not sure";

            return "hmm, didn't evaluate any if's";
    }

    public void simpleIf_gto_three() {
        boolean isTrue = false;

        if(isTrue == true) {
            System.out.println("TRUE");
        }

        if(isTrue=true) {
            System.out.println("Condition is isTrue=true, since its assignment, returns true");
        }
    }


}
