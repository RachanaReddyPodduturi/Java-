package main.com.jc.beginner.exceptions.customExceptions;

public class Guess_the_output {

    public static void main(String[] args) {
        //System.out.println(gto_example_one());
        //System.out.println(gto_example_two()); //20
        //System.out.println(gto_example_three());
        // System.out.println(gto_example_four());
       // System.out.println(gto_example_five());
       // System.out.println(gto_example_six());
       // System.out.println(gto_example_seven());
        // System.out.println(gto_example_eight());
      //  System.out.println(gto_example_nine());
        System.out.println(gto_example_ten());
    }
    public static int gto_example_one() {
        try {
            System.out.println("gto-statement-1");
            return 20;
        } catch (Exception ex) {
            return 30;
        }
    }
    public static int gto_example_two() {
        try {
            System.out.println("gto-statement-1");
            return 20;
        } catch (Exception ex) {
        }
        return 30;
    }
    public static int gto_example_three() {
        try {
            System.out.println("gto-try-statement-1");
            return 20;
        } catch (Exception ex) {
            return 30;
        } finally {
            System.out.println("gto-finally-statement-1");
            return 40;
        }
    }
    public static int gto_example_four() {
        try {
            System.out.println("gto-try-statement-1");
            return 20;
        } finally {
            System.out.println("gto-finally-statement-1");
            return 40;
        }
    }
    public static int gto_example_five() {
        try {
            System.out.println("gto-try-statement-1");
            throw new ArithmeticException("gto-arithmetic-exception");
        } catch (Exception ex) {
            System.out.println("gto-catch-exception-1");
            return 30;
        } finally {
            System.out.println("gto-finally-statement-1");
            return 40;
        }
    }
    public static int gto_example_six() {
        try {
            System.out.println("gto-try-statement-1");
            throw new ArithmeticException("gto-throw-arithmetic-exception");
        } catch (Exception ex) {
            System.out.println("gto-catch-exception-1");
            throw new RuntimeException("gto-throw-runtime-exception");
        } finally {
            System.out.println("gto-finally-statement-1");
        }
     }

    public static int gto_example_seven() {
        try {
            System.out.println("gto-try-statement-1");
            throw new ArithmeticException("gto-throw-arithmetic-exception");
        } catch (Exception ex) {
            System.out.println("gto-catch-exception-1");
            throw new RuntimeException("gto-throw-runtime-exception");
        } finally {
            System.out.println("gto-finally-statement-1");
        }
    }

    public static int gto_example_eight() {
        try {
            System.out.println("gto-try-statement-1");
            int a = 20 / 0; // Arithmetic
            System.out.println(a);
            return 10;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("gto-catch-exception-statement-1");
            return 20;
        } finally {
            System.out.println("gto-finally-statement-1");
            return 30;
        }
    }

    public static int gto_example_nine() {
        try {
            System.out.println("gto-try-statement-1");
            int a = 20 / 0;
            System.out.println(a);
            return 10;
        } catch (Exception ex) {
            System.out.println("gto-catch-exception-statement-1");
            return 20;
        } finally {
            System.out.println("gto-finally-statement-1");
            return 30;
        }
    }

    public static int gto_example_ten() {
        try {
            System.out.println("gto-try-statement-1");
            System.exit(1); // non-zero for abnormal termination of program

        } catch (Exception ex) {
            System.out.println("gto-catch-exception-statement-1");
            return 20;
        } finally {
            System.out.println("gto-finally-statement-1");
            return 30;
        }
    }

}
