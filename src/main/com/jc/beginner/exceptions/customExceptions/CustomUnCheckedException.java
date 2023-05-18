package main.com.jc.beginner.exceptions.customExceptions;

public class CustomUnCheckedException extends RuntimeException {

    public CustomUnCheckedException() {
        super();
    }
    public CustomUnCheckedException(String message) {
        super(message);
    }
}
