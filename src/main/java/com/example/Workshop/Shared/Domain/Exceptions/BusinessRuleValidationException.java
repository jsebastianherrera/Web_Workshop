package com.example.Workshop.Shared.Domain.Exceptions;

public class BusinessRuleValidationException extends RuntimeException {
    public BusinessRuleValidationException(String message, Object... args) {
        super(String.format(message, args));
    }
}
