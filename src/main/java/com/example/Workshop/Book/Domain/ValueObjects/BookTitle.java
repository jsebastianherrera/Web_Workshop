package com.example.Workshop.Book.Domain.ValueObjects;

import com.example.Workshop.Shared.Domain.Aggregate.StringValueObject;

public class BookTitle extends StringValueObject {
    public BookTitle(String value) {
        super(value);
        validate(value);
    }

    private void validate(String value) {
        titleValidation(value);
    }

    private void titleValidation(String value) {
        if (value.length() < 5 || value.length() > 100)
            throw new RuntimeException("Invalid length title");
    }
}