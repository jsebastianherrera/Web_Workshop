package com.example.Workshop.Shared.Domain.Aggregate;

import java.util.Objects;

public class StringValueObject {
    protected String value;
    public String value(){
        return value;
    }

    public static String intToString(int value) {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringValueObject that = (StringValueObject) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
