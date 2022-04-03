package com.example.Workshop.Shared.Domain.Exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message, Object... args) {
        super(String.format(message, args));
    }
}
