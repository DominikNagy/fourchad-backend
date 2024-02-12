package com.dominiknagy.fourchad.exceptions.specific;

public class BoardNotFoundException extends RuntimeException {
    public BoardNotFoundException(String message) {
        super(message);
    }
}
