package main.com.jc.beginner.basics.conditionals_and_loops;

public class ForLoop {

    public void forLoop_example_one() {
        for(int i=0; i<10; i++) {
            System.out.print(i); //0123456789
        }
    }

    public void forLoop_example_two() {
        for(int i=10; i>0; i--) {
            System.out.print(i); // 10 - 1
        }
    }

    public void forLoop_example_three() {
        String name = "fName";
        for(int i=1; i<=6; i++) {
            System.out.print(name + i);
            // fName1, fName2, fName3, fName4, fName4, fName5, fName6..
        }
    }

    public void forLoop_example_four() {
        for(int i =1, j=10; i < 10 && j > 1; i++, j--) {
            System.out.println( "i value - " + i + "; j value - " + j);

            // 1 10 -> 2 9 -> 3 8 -> 4 7 ->............->9 2
        }
    }

    public void forLoop_example_five() {
        for(int i =1, j=10; i <= j ; i++, j--) {
            System.out.println( "i value - " + i + "; j value - " + j);
        }
        // 1 10, 2 9, 3 8, 4 7, 5 6
    }

    public void forLoop_example_six() {
        for(int i =1, j=10; i < 10 ; i++, j--) {
            System.out.println( "i value - " + i + "; j value - " + j);
        }
        // 1 10, 2 9, 3 8, 4 7, 5 6, ...........9 2
    }




}
