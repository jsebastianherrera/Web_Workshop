package com.example.Workshop.Book.Domain.ValueObjects;

import com.example.Workshop.Shared.Domain.Aggregate.IntValueObject;
import com.example.Workshop.Shared.Domain.Aggregate.StringValueObject;
import com.example.Workshop.Shared.Domain.Exceptions.BusinessRuleValidationException;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
public class BookYear extends IntValueObject {
    public BookYear(int value) {
        validate(value);
        this.value = value;
    }

    private void validate(int value) {
        yearValidation(value);
    }

    private void yearValidation(int value) {
        if (StringValueObject.intToString(value).length() != 4)
            throw new BusinessRuleValidationException("Year needs to have 4 characters");

        if (value > LocalDate.now().getYear())
            throw new BusinessRuleValidationException("Year should not be greater than the current one");
    }
}
