package main.com.jc.beginner.simple_interview_programs;

public class GetEvenOrOddNumbers {

    /**
     * 1. Get all even numbers 1 to 100
     * @return
     */
    public int[] getEvenNumbers() {
        int[] evenNumbers = new int[50];
        for(int i=0; i<100; i++) {
            if(i%2==0) {
                evenNumbers[i/2] = i; //
            }
        }
        return evenNumbers;
    }
}
