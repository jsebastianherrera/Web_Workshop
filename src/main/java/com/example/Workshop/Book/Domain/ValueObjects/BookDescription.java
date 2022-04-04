package com.example.Workshop.Book.Domain.ValueObjects;

import com.example.Workshop.Shared.Domain.Aggregate.StringValueObject;
import com.example.Workshop.Shared.Domain.Exceptions.BusinessRuleValidationException;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BookDescription extends StringValueObject {

    public BookDescription(String value) {
        validate(value);
        this.value = value;
    }

    private void validate(String value) {
        descriptionForm(value);
    }

    private void descriptionForm(String value) {
        if (value.length() > 200)
            throw new BusinessRuleValidationException("Description length should not be greater than 200 characters");
    }
}
