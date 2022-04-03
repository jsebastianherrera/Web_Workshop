package com.example.Workshop.Book.Infrastructure.Adapters;

import com.example.Workshop.Book.Domain.Book;
import com.example.Workshop.Book.Domain.Ports.BookRepository;
import com.example.Workshop.Book.Domain.ValueObjects.BookAuthorName;
import com.example.Workshop.Book.Domain.ValueObjects.BookAuthorSurname;
import com.example.Workshop.Book.Domain.ValueObjects.BookTitle;

import java.util.List;
import java.util.Optional;

public class HibernateBookRepository implements BookRepository {
    @Override
    public Book save(Book book) {
        return book;
    }

    @Override
    public Optional<Book> findByTitle(BookTitle title) {
        return Optional.empty();
    }

    @Override
    public Optional<List<Book>> findByAuthor(BookAuthorName name, BookAuthorSurname surname) {
        return Optional.empty();
    }
}
