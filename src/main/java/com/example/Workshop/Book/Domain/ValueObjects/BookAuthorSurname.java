package com.example.Workshop.Book.Domain.ValueObjects;

import com.example.Workshop.Shared.Domain.Aggregate.StringValueObject;

public class BookAuthorSurname extends StringValueObject {

    public BookAuthorSurname(String value) {
        super(value);
        validate(value);
    }

    private void validate(String value) {
        surnameForm(value);
    }

    private void surnameForm(String value) {
        if (value.length() < 4 || value.length() > 40)
            throw new RuntimeException("Invalid length surname");
    }
}
