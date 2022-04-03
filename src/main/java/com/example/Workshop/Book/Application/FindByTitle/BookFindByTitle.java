package com.example.Workshop.Book.Application.FindByTitle;

import com.example.Workshop.Book.Domain.Book;
import com.example.Workshop.Book.Domain.Ports.BookRepository;
import com.example.Workshop.Book.Domain.ValueObjects.BookTitle;
import com.example.Workshop.Shared.Domain.Exceptions.NotFoundException;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BookFindByTitle {

    private final BookRepository bookRepository;

    public Book execute(String title) {
        return bookRepository.findByTitle(new BookTitle(title))
                .orElseThrow(() -> new NotFoundException("Book with title %s not found", title));
    }
}
