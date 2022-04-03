package com.example.Workshop.Book.Domain;

import com.example.Workshop.Book.Domain.ValueObjects.BookAuthorName;
import com.example.Workshop.Book.Domain.ValueObjects.BookAuthorSurname;
import com.example.Workshop.Book.Domain.ValueObjects.BookDescription;
import com.example.Workshop.Book.Domain.ValueObjects.BookPages;
import com.example.Workshop.Book.Domain.ValueObjects.BookPrice;
import com.example.Workshop.Book.Domain.ValueObjects.BookTitle;
import com.example.Workshop.Book.Domain.ValueObjects.BookYear;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.HashMap;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private BookAuthorName bookAuthorName;
    private BookAuthorSurname bookAuthorSurname;
    private BookDescription bookDescription;
    private BookPages bookPages;
    private BookPrice bookPrice;
    private BookTitle bookTitle;
    private BookYear bookYear;

    public static Book create(BookAuthorName authorName, BookAuthorSurname authorSurname, BookDescription description,
                       BookPages pages, BookPrice price, BookTitle title, BookYear year) {
        return Book.builder()
                .bookAuthorName(authorName)
                .bookAuthorSurname(authorSurname)
                .bookDescription(description)
                .bookPages(pages)
                .bookPrice(price)
                .bookTitle(title)
                .bookYear(year)
                .build();
    }

    public HashMap<String, Object> data() {
        return new HashMap<>() {{
            put("authorName", bookAuthorName.value());
            put("authorSurname", bookAuthorSurname.value());
            put("description", bookDescription.value());
            put("pages", bookPages.value());
            put("price", bookPrice.value());
            put("title", bookTitle.value());
            put("year", bookYear.value());
        }};
    }
}
