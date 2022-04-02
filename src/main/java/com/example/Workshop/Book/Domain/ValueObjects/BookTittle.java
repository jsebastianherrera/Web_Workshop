package com.example.Workshop.Book.Domain.ValueObjects;

import com.example.Workshop.Shared.Domain.Aggregate.StringValueObject;

public class BookTittle extends StringValueObject {
    public BookTittle(String value) {
        super(value);
        validate(value);
    }
    private void validate(String value) {
        tittleValidation(value);
    }

    private void tittleValidation(String value) {
        if (value.length() < 5 || value.length() > 100)
            throw new RuntimeException("Invalid length tittle");
    }
}
