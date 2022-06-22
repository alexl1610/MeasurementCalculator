package com.example.measurementcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calc = new Calculator();

    @Test
    void ounceTest() {
        int a = 1;

        double expected = 28.35;

        double result = calc.ounce(a);

        assertEquals(expected, result);
    }

    @Test
    void stoneTest() {
        assertEquals(6.35, calc.stone(1));
    }

}