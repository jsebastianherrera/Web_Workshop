package com.example.Workshop.Book.Domain.ValueObjects;

import com.example.Workshop.Shared.Domain.Aggregate.StringValueObject;
import com.example.Workshop.Shared.Domain.Exceptions.BusinessRuleValidationException;

public class BookAuthorName extends StringValueObject {

    public BookAuthorName(String value) {
        super(value);
        validate(value);
    }

    private void validate(String value) {
        nameForm(value);
    }

    private void nameForm(String value) {
        if (value.length() < 4 || value.length() > 20)
            throw new BusinessRuleValidationException("Invalid length name");
    }
}
