package com.example.Workshop.Author;

import com.example.Workshop.Author.Domain.ValueObjects.AuthorName;
import com.example.Workshop.Author.Domain.ValueObjects.AuthorSurname;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.HashMap;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    @NonNull
    private AuthorName authorName;

    @NonNull
    private AuthorSurname authorSurname;

    public HashMap<String, Object> data() {
        return new HashMap<>() {{
            put("name", authorName.value());
            put("surname", authorSurname.value());
        }};
    }
}
