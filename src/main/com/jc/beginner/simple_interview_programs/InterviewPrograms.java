package main.com.jc.beginner.simple_interview_programs;

public class InterviewPrograms {



    /**
     * 2. Missing number from 1 to 20
     * @return
     */
    public int getMissingNumber() {
        int n= 20;
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19, 20};

        int sum = 0;
        for(int i=0; i < arr.length; i++) {
            sum += arr[i];
        }

        int sumOfNumbers = n*(n+1)/2;

        return sumOfNumbers - sum;
    }



    /**
     * Print array elements.
     *
     * @param arr
     */
    public void printElementsInAnArray(int[] arr) {
       for(int i=0; i<arr.length; i++) {
           System.out.println(arr[i]);
       }
    }
}
