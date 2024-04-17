package org.example;

public class IncompatibleDataFormatException extends RuntimeException {
    public IncompatibleDataFormatException() {
        super();
    }

    public IncompatibleDataFormatException(String message) {
        super(message);
    }

    public IncompatibleDataFormatException(String message, Throwable cause) {
        super(message, cause);
    }
}
