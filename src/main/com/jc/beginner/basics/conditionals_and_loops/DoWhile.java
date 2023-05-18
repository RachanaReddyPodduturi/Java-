package main.com.jc.beginner.basics.conditionals_and_loops;

public class DoWhile {
    public void doWhile_example_one() {
        int i=0;
        do {
            System.out.println(i); //0 1 2 3 ..9
            i++;
        } while(i <10);
    }

    public void doWhile_example_two() {
        int x= 1, sum = 0 ; // 1 2 3 4 5 6 -> fails
        do {
            sum += x; // sum = sum + x; // 1 3 6 10 15
            x++;

        } while( x <= 5);

        System.out.println(sum);
    }

    public void doWhile_example_three() {
        int i=0;
        do
            System.out.println(i);
        while(i>=3); // 0
    }

    public void doWhile_example_four() {
        int i=10;
        do
         System.out.println(i);
        while(i>=3);
    }
}
