package com.example.Workshop.Book.Domain.ValueObjects;

import com.example.Workshop.Shared.Domain.Aggregate.StringValueObject;
import com.example.Workshop.Shared.Domain.Exceptions.BusinessRuleValidationException;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

@NoArgsConstructor
public class BookAuthorName extends StringValueObject {

    public BookAuthorName(String value) {
        validate(value);
        this.value = value;
    }

    private void validate(String value) {
        nameForm(value);
    }

    private void nameForm(String value) {
        if (StringUtils.isBlank(value))
            throw new BusinessRuleValidationException("Author name should not be empty");
    }
}
