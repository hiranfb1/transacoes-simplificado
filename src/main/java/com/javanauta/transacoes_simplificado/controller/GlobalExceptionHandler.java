package com.javanauta.transacoes_simplificado.controller;

import com.javanauta.transacoes_simplificado.infrastructure.exceptions.BadRequestException;
import com.javanauta.transacoes_simplificado.infrastructure.exceptions.UserNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException e) {
        return new ResponseEntity<>("Erro: " + e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<String> handleBadRequestException(BadRequestException e) {
        return new ResponseEntity<>("Erro: " + e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UserNotFound.class)
    public ResponseEntity<String> handleUserNotFoundException(UserNotFound e) {
        return new ResponseEntity<>("Erro: " + e.getMessage(), HttpStatus.NOT_FOUND);
    }
}