package com.calculator.tdd;

public class NegativeNumbersNotAllowedException extends RuntimeException{
    public NegativeNumbersNotAllowedException(String message) {
        super(message);
    }
}
