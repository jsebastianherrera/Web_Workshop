package com.example.Workshop.Book.Application.FindByAuthor;

import com.example.Workshop.Book.Domain.Book;
import com.example.Workshop.Book.Domain.Ports.BookRepository;
import com.example.Workshop.Book.Domain.ValueObjects.BookAuthorName;
import com.example.Workshop.Book.Domain.ValueObjects.BookAuthorSurname;
import com.example.Workshop.Book.Domain.ValueObjects.BookDescription;
import com.example.Workshop.Book.Domain.ValueObjects.BookPages;
import com.example.Workshop.Book.Domain.ValueObjects.BookPrice;
import com.example.Workshop.Book.Domain.ValueObjects.BookTitle;
import com.example.Workshop.Book.Domain.ValueObjects.BookYear;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class BookFindByAuthor {

    private final BookRepository bookRepository;

    public List<Book> execute(String name, String surname) {
        return List.of(Book.builder()
                .bookTitle(new BookTitle("Test Title"))
                .bookAuthorName(new BookAuthorName("Test"))
                .bookAuthorSurname(new BookAuthorSurname("Test"))
                .bookDescription(new BookDescription("description"))
                .bookYear(new BookYear(1995))
                .bookPages(new BookPages(195))
                .bookPrice(new BookPrice(250000))
                .build());
    }
}
