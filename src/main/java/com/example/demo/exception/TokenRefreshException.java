package com.example.demo.exception;

public class TokenRefreshException extends RuntimeException{
    public TokenRefreshException(String msg) {
        super(msg);
    }
}
