package com.javanauta.transacoes_simplificado.infrastructure.exceptions;

public class UserNotFound extends RuntimeException {
    public UserNotFound(String message) {
        super(message);
    }
}