package com.calculator.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    StringCalculator stringCalculator;

    public StringCalculatorTest() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void testCalculatorTwoNumbers() {
        String input = "1,2";
        assertEquals(3, stringCalculator.add(input));
    }

    @Test
    public void testCalculatorSingleNumber() {
        String input = "123";
        assertEquals(123, stringCalculator.add(input));
    }

    @Test
    public void testCalculatorEmptyString() {
        String input = "";
        assertEquals(0, stringCalculator.add(input));
    }

    @Test
    public void testCalculatorIgnoreGreaterOneThousandNumber() {
        String input = "2,1001";
        assertEquals(2, stringCalculator.add(input));
    }
}