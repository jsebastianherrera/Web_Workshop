package com.example.Workshop.Shared.Domain.Aggregate;

import java.util.Objects;

public class IntValueObject {
    protected int value;

    public int value(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntValueObject that = (IntValueObject) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
