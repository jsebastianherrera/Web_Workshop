package com.example.Workshop.Book.Domain.ValueObjects;

import com.example.Workshop.Shared.Domain.Aggregate.StringValueObject;

public class BookYear extends StringValueObject {
    public BookYear(String value) {
        super(value);
        validate(value);
    }
    private void validate(String value) {
        yearValidation(value);
    }

    private void yearValidation(String value) {
        if (value.length()!=4)
            throw new RuntimeException("Year needs to have 4 characters");
    }
}
