package org.example.exception;

public class AnimalCanNoLongerEatException extends RuntimeException {
    public AnimalCanNoLongerEatException(String message) {
        super(message);
    }
}
