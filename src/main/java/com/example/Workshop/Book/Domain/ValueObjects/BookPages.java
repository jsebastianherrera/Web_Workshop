package com.example.Workshop.Book.Domain.ValueObjects;

import com.example.Workshop.Shared.Domain.Aggregate.IntValueObject;

public class BookPages extends IntValueObject {
    public BookPages(int value) {
        super(value);
        validate(value);
    }

    private void validate(int value) {
        pagesValidation(value);
    }

    private void pagesValidation(int value) {
        if (value < 1 || value > 1500)
            throw new RuntimeException("Number of pages should be between 1 and 1500");
    }
}
