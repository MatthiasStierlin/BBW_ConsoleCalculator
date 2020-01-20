package ch.bbw.mssz;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Matthias_Stierlin
 * @version 19.01.2020
 */
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testSumTwoPositiveNumbersPass() {
        assertEquals(30,calculator.sum(10,20));
    }

    @Test
    void testSumOneNegativeAndOnePositiveNumberPass() {
        assertEquals(20,calculator.sum(30,-10));
    }

    @Test
    void testSumTwoNegativeNumbersPass() {
        assertEquals(-30,calculator.sum(-10,-20));
    }

    @Test
    void testSubtractTwoPositiveNumbersPass() {
        assertEquals(20,calculator.subtract(30,10));
    }

    @Test
    void testSubtractOneNegativeAndOnePositiveNumberPass() {
        assertEquals(30,calculator.subtract(20,-10));
    }

    @Test
    void testSubtractTwoNegativeNumbersPass() {
        assertEquals(-20, calculator.subtract(-30,-10));
    }
}