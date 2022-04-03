package com.example.Workshop.Book.Domain.ValueObjects;

import com.example.Workshop.Shared.Domain.Aggregate.IntValueObject;
import com.example.Workshop.Shared.Domain.Aggregate.StringValueObject;

import java.time.LocalDate;

public class BookYear extends IntValueObject {
    public BookYear(int value) {
        super(value);
        validate(value);
    }

    private void validate(int value) {
        yearValidation(value);
    }

    private void yearValidation(int value) {
        if (StringValueObject.intToString(value).length() != 4)
            throw new RuntimeException("Year needs to have 4 characters");

        if (value > LocalDate.now().getYear())
            throw new RuntimeException("Invalid year");
    }
}
