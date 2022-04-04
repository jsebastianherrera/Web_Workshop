package com.example.Workshop.Book.Domain.ValueObjects;

import com.example.Workshop.Shared.Domain.Aggregate.StringValueObject;
import com.example.Workshop.Shared.Domain.Exceptions.BusinessRuleValidationException;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

@NoArgsConstructor
public class BookAuthorSurname extends StringValueObject {

    public BookAuthorSurname(String value) {
        validate(value);
        this.value = value;
    }

    private void validate(String value) {
        surnameForm(value);
    }

    private void surnameForm(String value) {
        if (StringUtils.isBlank(value))
            throw new BusinessRuleValidationException("Author surname should not be empty");
    }
}
