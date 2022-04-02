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
        if (String.valueOf(value).length() < 1)
            throw new RuntimeException("non-negative number of pages");
    }
}
