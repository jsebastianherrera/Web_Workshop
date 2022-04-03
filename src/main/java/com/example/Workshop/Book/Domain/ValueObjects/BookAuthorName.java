package com.example.Workshop.Book.Domain.ValueObjects;

import com.example.Workshop.Shared.Domain.Aggregate.StringValueObject;
import com.example.Workshop.Shared.Domain.Exceptions.BusinessRuleValidationException;
import org.apache.commons.lang3.StringUtils;

public class BookAuthorName extends StringValueObject {

    public BookAuthorName(String value) {
        super(value);
        validate(value);
    }

    private void validate(String value) {
        nameForm(value);
    }

    private void nameForm(String value) {
        if (StringUtils.isBlank(value))
            throw new BusinessRuleValidationException("Author name should not be empty");
    }
}
