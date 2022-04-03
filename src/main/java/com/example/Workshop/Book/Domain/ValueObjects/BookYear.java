package com.example.Workshop.Book.Domain.ValueObjects;

import com.example.Workshop.Shared.Domain.Aggregate.IntValueObject;
import com.example.Workshop.Shared.Domain.Aggregate.StringValueObject;

import java.time.LocalDate;

public class BookYear extends StringValueObject {
    public BookYear(String value) {
        super(value);
        validate(value);
    }

    private void validate(String value) {
        yearValidation(value);
    }

    private void yearValidation(String value) {
        if (value.length() != 4)
            throw new RuntimeException("Year needs to have 4 characters");

        if (IntValueObject.stringToInt(value) > LocalDate.now().getYear())
            throw new RuntimeException("Invalid year");
    }
}
