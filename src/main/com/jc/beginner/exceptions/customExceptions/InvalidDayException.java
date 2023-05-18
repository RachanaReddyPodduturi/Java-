package main.com.jc.beginner.exceptions.customExceptions;

public class InvalidDayException extends Exception {

    public InvalidDayException() {
        super();
    }

    public InvalidDayException(String message) {
        super(message);
    }
}
