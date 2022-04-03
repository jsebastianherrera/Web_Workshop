package com.example.Workshop.Book.Infrastructure.Controllers;

import com.example.Workshop.Book.Application.FindByTitle.BookFindByTitle;
import com.example.Workshop.Book.Application.FindByTitle.BookFindByTitleResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/book")
@RequiredArgsConstructor
public class BookFindByTitleController {
    private final BookFindByTitle findByTitle;

    @GetMapping(value = "/title/{title}")
    public ResponseEntity<HashMap<String, Object>> execute(@PathVariable(name = "title") String title) {
        BookFindByTitleResponse response = new BookFindByTitleResponse(findByTitle.execute(title));
        return ResponseEntity.status(HttpStatus.OK).body(response.response());
    }
}
