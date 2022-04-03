package com.example.Workshop.Shared.Domain.Exceptions;

public class ExistingBookException extends RuntimeException {
    public ExistingBookException(String message, Object... args) {
        super(String.format(message, args));
    }
}
