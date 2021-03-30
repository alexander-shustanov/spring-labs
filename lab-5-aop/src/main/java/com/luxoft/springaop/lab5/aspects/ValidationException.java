package com.luxoft.springaop.lab5.aspects;

public class ValidationException extends RuntimeException {
    public ValidationException(String message) {
        super(message);
    }
}
