package com.example.Workshop.Book.Infrastructure.Controllers;

import com.example.Workshop.Book.Application.Create.BookCreator;
import com.example.Workshop.Book.Application.Create.BookCreatorResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/book")
@RequiredArgsConstructor
public class BookCreateController {

    private final BookCreator creator;

    @PostMapping(value = "/create")
    public ResponseEntity<HashMap<String, Object>> execute(@RequestBody BookCreatorRequest request) {
        BookCreatorResponse response = new BookCreatorResponse(
                creator.execute(request.getAuthorName(), request.getAuthorSurname(), request.getDescription(),
                        request.getPages(), request.getPrice(), request.getTitle(), request.getYear()));
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(response.response());
    }

    @Data
    @Builder
    @AllArgsConstructor
    static class BookCreatorRequest {
        private String authorName;
        private String authorSurname;
        private String description;
        private int pages;
        private int price;
        private String title;
        private int year;
    }
}
