package com.example.Workshop.Book;

import com.example.Workshop.Book.Domain.ValueObjects.*;

import java.util.HashMap;

public class Book {
    private BookAuthor bookAuthor;
    private BookDescription bookDescription;
    private BookPages bookPages;
    private BookPrice bookPrice;
    private BookTittle bookTittle;
    private BookYear bookYear;

    public Book(BookAuthor bookAuthor, BookDescription bookDescription, BookPages bookPages, BookPrice bookPrice, BookTittle bookTittle, BookYear bookYear) {
        this.bookAuthor = bookAuthor;
        this.bookDescription = bookDescription;
        this.bookPages = bookPages;
        this.bookPrice = bookPrice;
        this.bookTittle = bookTittle;
        this.bookYear = bookYear;
    }
}
