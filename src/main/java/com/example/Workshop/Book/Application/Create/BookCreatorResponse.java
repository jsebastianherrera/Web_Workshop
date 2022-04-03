package com.example.Workshop.Book.Application.Create;

import com.example.Workshop.Book.Domain.Book;
import lombok.AllArgsConstructor;

import java.util.HashMap;

@AllArgsConstructor
public class BookCreatorResponse {
    private Book book;

    public HashMap<String, Object> response() {
        return this.book.data();
    }
}
