package com.dominiknagy.fourchad.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import java.time.OffsetDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({NoResourceFoundException.class})
    public ResponseEntity<Object> handleNoResourceFoundException(NoResourceFoundException e) {
        ExceptionResponse exceptionResponse =
                new ExceptionResponse(e.getMessage(), HttpStatus.NOT_FOUND, OffsetDateTime.now());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exceptionResponse);
    }

    @ExceptionHandler({BoardNotFoundException.class})
    public ResponseEntity<Object> handleBoardNotFoundException(BoardNotFoundException e) {
        ExceptionResponse exceptionResponse =
                new ExceptionResponse(e.getMessage(), HttpStatus.NOT_FOUND, OffsetDateTime.now());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exceptionResponse);
    }

    @ExceptionHandler({HttpRequestMethodNotSupportedException.class})
    public ResponseEntity<Object> handleMethodNotAllowedException(HttpRequestMethodNotSupportedException e) {
        ExceptionResponse exceptionResponse =
                new ExceptionResponse(e.getMessage(), HttpStatus.METHOD_NOT_ALLOWED, OffsetDateTime.now());
        return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body(exceptionResponse);
    }
}