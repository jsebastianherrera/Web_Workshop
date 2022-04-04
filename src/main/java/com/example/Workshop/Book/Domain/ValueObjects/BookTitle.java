package com.example.Workshop.Book.Domain.ValueObjects;

import com.example.Workshop.Shared.Domain.Aggregate.StringValueObject;
import com.example.Workshop.Shared.Domain.Exceptions.BusinessRuleValidationException;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
public class BookTitle extends StringValueObject implements Serializable {
    public BookTitle(String value) {
        validate(value);
        this.value = value;
    }

    private void validate(String value) {
        titleValidation(value);
    }

    private void titleValidation(String value) {
        if (value.length() < 5 || value.length() > 100)
            throw new BusinessRuleValidationException("Title length should be between 5 and 100 characters");
    }
}
