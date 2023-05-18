package main.com.jc.beginner.basics.conditionals_and_loops;

public class ForLoop_Extended {

    public void forLoop_extended_example_one() {
        for(int i=0; i < 6; i++) {
            System.out.println(i); // 0 1 2 3 4 5
            for(int j=0; j< 5; j++) {
                System.out.print(j); //0-4, 0-4, 0-4, 0-4, 0-4, 0-4
            }
            System.out.println();
        }
    }

    public void forLoop_extended_example_two() {
        for(int i=0; i < 10; i++) {
            System.out.println(i); // 0  1 2 ......9
            for(int j=i; j< 10; j++) {
                System.out.print(j); // 0-9 1-9 2-9 9
            }
            System.out.println();
        }
    }

    public void forLoop_extended_example_three() {
        for(int i=0; i < 10; i++) { // 0 1 2 3   ... 9
            for(int j=0; j<=i; j++) {
                System.out.print(j); //0 01 012 0123..... 0123...9
            }
            System.out.println();
        }
    }

    public void forLoop_extended_example_four() {
        for(int i=0; i < 10; i++) {
            if(i==4) break;
            System.out.println(i);
        }
    }

    public void forLoop_extended_example_five() {
        for(int i=0; i < 10; i++) {
            if(i==4) continue;
            System.out.println(i);
        }
    }

}
