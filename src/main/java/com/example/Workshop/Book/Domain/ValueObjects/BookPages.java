package com.example.Workshop.Book.Domain.ValueObjects;

import com.example.Workshop.Shared.Domain.Aggregate.IntValueObject;
import com.example.Workshop.Shared.Domain.Exceptions.BusinessRuleValidationException;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BookPages extends IntValueObject {
    public BookPages(int value) {
        validate(value);
        this.value = value;
    }

    private void validate(int value) {
        pagesValidation(value);
    }

    private void pagesValidation(int value) {
        if (value < 1 || value > 1500)
            throw new BusinessRuleValidationException("Number of pages should be between 1 and 1500");
    }
}
