package com.example.Workshop.Book.Infrastructure.Controllers;

import com.example.Workshop.Book.Application.FindByAuthor.BookFindByAuthor;
import com.example.Workshop.Book.Application.FindByAuthor.BookFindByAuthorResponse;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "/book")
@RequiredArgsConstructor
public class BookFindByAuthorController {
    private final BookFindByAuthor findByAuthor;

    @PostMapping(value = "/author")
    public ResponseEntity<List<HashMap<String, Object>>> execute(@RequestBody BookFindByAuthorRequest request) {
        BookFindByAuthorResponse response =
                new BookFindByAuthorResponse(findByAuthor.execute(request.getAuthorName(), request.getAuthorSurname()));
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(response.response());
    }

    @Data
    static class BookFindByAuthorRequest {
        private String authorName;
        private String authorSurname;
    }
}
