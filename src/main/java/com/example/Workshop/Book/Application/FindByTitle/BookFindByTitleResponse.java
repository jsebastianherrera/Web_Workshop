package com.example.Workshop.Book.Application.FindByTitle;

import com.example.Workshop.Book.Domain.Book;
import lombok.AllArgsConstructor;

import java.util.HashMap;

@AllArgsConstructor
public class BookFindByTitleResponse {
    private Book book;

    public HashMap<String, Object> response() {
        return book.data();
    }
}
