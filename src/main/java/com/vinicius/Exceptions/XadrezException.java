package com.vinicius.Exceptions;

public class XadrezException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public XadrezException(String message) {
        super(message);
    }
}
