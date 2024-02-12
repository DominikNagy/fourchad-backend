package com.dominiknagy.fourchad.exceptions.specific;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException() {
        super("User not found");
    }
}
