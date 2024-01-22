package ru.hmw.exceptions;

/**
 * The type Line too long exception.
 */
public class LineTooLong extends RuntimeException {
    public LineTooLong(String message) {
        super(message);
    }
}
