package com.example.Workshop.Book.Domain.ValueObjects;

import com.example.Workshop.Shared.Domain.Aggregate.DoubleValueObject;

public class BookPrice extends DoubleValueObject {
    public BookPrice(double value) {
        super(value);
        validate(value);
    }

    private void validate(double value) {
        priceValidation(value);
        centsValidations(value);
    }

    private void priceValidation(double value) {
        if (value < 10000)
            throw new RuntimeException("non-negative values are allowed");
    }

    private void centsValidations(double value) {
        if (String.valueOf(value).contains("."))
            throw new RuntimeException("cents are not allowed");
    }
}
