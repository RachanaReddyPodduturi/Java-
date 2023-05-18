package main.com.jc.beginner.basics.conditionals_and_loops;

public class WhileLoop {

    public void whileLoop_example_one() {
        int i= 0;
        while(i<5) { //0 1 2 3 4
            System.out.println(i);
            i++;
        }
    }

    public void whileLoop_example_two() {
        int i= 0;
        while(i<5)
            System.out.println(i);
    }

    public void whileLoop_example_three() {
        int sum =0, i = 0;
        while(i<5) { // 0 1 2 3 4 5 -> fails
            sum+=i;// sum = sum + i;  // sum 0 1 3 6 10
            i++;
        }
        System.out.println(sum); // 10
    }
}
