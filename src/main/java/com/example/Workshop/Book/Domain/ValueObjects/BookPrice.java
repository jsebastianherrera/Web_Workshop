package com.example.Workshop.Book.Domain.ValueObjects;

import com.example.Workshop.Shared.Domain.Aggregate.IntValueObject;
import com.example.Workshop.Shared.Domain.Exceptions.BusinessRuleValidationException;

public class BookPrice extends IntValueObject {
    public BookPrice(int value) {
        super(value);
        validate(value);
    }

    private void validate(int value) {
        priceValidation(value);
    }

    private void priceValidation(int value) {
        if (value < 10000)
            throw new BusinessRuleValidationException("Price should be greater than 10000");
    }
}
