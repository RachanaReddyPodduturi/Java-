package main.com.jc.beginner.simple_interview_programs;


public class SwapElements {

    /**
     * 1. swap elements
     *
     * @param a
     * @param b
     */
    public void swapElements(int a, int b) {
        System.out.println("Before Swapping: a - " + a + ": b - "+ b);

        int temp = a;  // in temp 10
        a = b;  // a = 20
        b = temp; // b= 10

        System.out.println("After Swapping: a - " + a + ": b - "+ b);
    }

}
