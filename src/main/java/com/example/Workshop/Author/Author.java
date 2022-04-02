package com.example.Workshop.Author;

import com.example.Workshop.Author.Domain.ValueObjects.AuthorName;
import com.example.Workshop.Author.Domain.ValueObjects.AuthorSurname;

import java.util.HashMap;

public class Author {
    private AuthorName authorName;
    private AuthorSurname authorSurname;

    public Author(AuthorName authorName, AuthorSurname authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }
    public HashMap<String,Object> data(){
        HashMap<String,Object>data =new HashMap<>(){{
            put("name",authorName.value());
            put("surname",authorSurname.value());
        }};
        return data;
    }
}
