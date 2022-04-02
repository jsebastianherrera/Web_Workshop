package com.example.Workshop.Book.Domain.ValueObjects;

import com.example.Workshop.Shared.Domain.Aggregate.StringValueObject;

public class BookDescription extends StringValueObject {

    public BookDescription(String description) {
        super(description);
        validate(description);
    }

    private void validate(String value) {
        descriptionForm(value);
    }

    private void descriptionForm(String value) {
        if (value.length() < 4 || value.length() > 200)
            throw new RuntimeException("Invalid length description");
    }
}
