package com.example.Workshop.Book.Application.FindByAuthor;

import com.example.Workshop.Book.Domain.Book;
import com.example.Workshop.Book.Domain.Ports.BookRepository;
import com.example.Workshop.Book.Domain.ValueObjects.BookAuthorName;
import com.example.Workshop.Book.Domain.ValueObjects.BookAuthorSurname;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class BookFindByAuthor {

    private final BookRepository bookRepository;

    public List<Book> execute(String name, String surname) {
        return bookRepository.findByAuthor(new BookAuthorName(name), new BookAuthorSurname(surname))
                .orElse(new ArrayList<>());
    }
}
