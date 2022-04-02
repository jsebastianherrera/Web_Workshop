package com.example.Workshop.Author.Domain.ValueObjects;

import com.example.Workshop.Shared.Domain.Aggregate.StringValueObject;

public class AuthorName extends StringValueObject {
    public AuthorName(String value) {
        super(value);
    }

    private void validate(String value) {
        nameForm(value);
    }

    private void nameForm(String value) {
        if (value.length() < 4 || value.length() > 20)
            throw new RuntimeException("Invalid length name");
    }
}
