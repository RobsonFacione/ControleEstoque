package com.controleestoque.backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> tratarRuntimeException(RuntimeException erro) {

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(erro.getMessage());

    }
}

// Irá aparecer no Postman a requisição correta