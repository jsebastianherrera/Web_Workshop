package com.example.Workshop.Book.Application.Create;

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

@RequiredArgsConstructor
public class BookCreator {

    private final BookRepository repository;

    public Book execute(String authorName, String authorSurname, String description, int pages, int price,
                        String title, int year) {
        Book book = Book.create(
                new BookAuthorName(authorName),
                new BookAuthorSurname(authorSurname),
                new BookDescription(description),
                new BookPages(pages),
                new BookPrice(price),
                new BookTitle(title),
                new BookYear(year)
        );

        return book;
    }
}
