package main.com.jc.beginner.exceptions.customExceptions;

public class CustomCheckedException extends Exception {

    public CustomCheckedException() {
      super();
    }

    public CustomCheckedException(String message) {
        super(message);
    }

    public CustomCheckedException(String message, Throwable ex) {
        super(message, ex);
    }

    public CustomCheckedException(Throwable ex) {
        super(ex);
    }

}
