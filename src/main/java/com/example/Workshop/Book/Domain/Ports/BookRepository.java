package com.example.Workshop.Book.Domain.Ports;

import com.example.Workshop.Book.Domain.Book;
import com.example.Workshop.Book.Domain.ValueObjects.BookAuthorName;
import com.example.Workshop.Book.Domain.ValueObjects.BookAuthorSurname;
import com.example.Workshop.Book.Domain.ValueObjects.BookTitle;

import java.util.List;
import java.util.Optional;

public interface BookRepository {
    Book save(Book book);

    Optional<Book> findByTitle(BookTitle title);

    Optional<List<Book>> findByAuthor(BookAuthorName name, BookAuthorSurname surname);
}
