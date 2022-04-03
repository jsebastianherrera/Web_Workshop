package com.example.Workshop.Shared.Infrastructure.Controller;

import com.example.Workshop.Shared.Domain.Exceptions.ExistingBookException;
import com.example.Workshop.Shared.Domain.Exceptions.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;

@ControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<HashMap<String, String>> handleNotFoundException(NotFoundException exception) {
        HashMap<String, String> response = createResponseHashMap(exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }

    @ExceptionHandler(ExistingBookException.class)
    public ResponseEntity<HashMap<String, String>> handleExistingBookException(ExistingBookException exception) {
        HashMap<String, String> response = createResponseHashMap(exception.getMessage());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(response);
    }

    private HashMap<String, String> createResponseHashMap(String error) {
        return new HashMap<>() {{
            put("error", error);
        }};
    }
}
