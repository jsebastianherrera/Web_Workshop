package com.example.Workshop.Book.Application.FindByAuthor;

import com.example.Workshop.Book.Domain.Book;
import lombok.AllArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class BookFindByAuthorResponse {
    private List<Book> books;

    public List<HashMap<String, Object>> response() {
        return books.stream().map(Book::data).collect(Collectors.toList());
    }
}
