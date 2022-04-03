package com.example.Workshop.Book;

import com.example.Workshop.Book.Domain.ValueObjects.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private BookAuthor bookAuthor;
    private BookDescription bookDescription;
    private BookPages bookPages;
    private BookPrice bookPrice;
    private BookTitle bookTitle;
    private BookYear bookYear;
}
