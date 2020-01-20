package ch.bbw.mssz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Matthias_Stierlin
 * @version 20.01.2020
 */
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    //Calculator.sum
    @Test
    void testSumTwoPositiveNumbersPass() {
        assertEquals(30,calculator.sum(10,20));
    }

    @Test
    void testSumOneNegativeAndOnePositiveNumberPass() {
        assertEquals(20,calculator.sum(30,-10));
    }

    @Test
    void testSumOnePositiveNumberAndZeroPass() {
        assertEquals(18, calculator.sum(18, 0));
    }

    @Test
    void testSumMaxValueAndMinValuePass() {
        assertEquals(-1,calculator.sum(Integer.MAX_VALUE,Integer.MIN_VALUE));
    }

    @Test
    void testSumMaxValueAndPositiveNumberPass() {
        assertEquals(-2147483631,calculator.sum(Integer.MAX_VALUE,18));
    }

    @Test
    void testSumMaxValueAndNegativeNumberPass() {
        assertEquals(2147483629,calculator.sum(Integer.MAX_VALUE,-18));
    }

    @Test
    void testSumMinValueAndPositiveNumberPass() {
        assertEquals(-2147483630,calculator.sum(Integer.MIN_VALUE,18));
    }

    @Test
    void testSumMinValueAndNegativeNumberPass() {
        assertEquals(2147483630,calculator.sum(Integer.MIN_VALUE,-18));
    }

    @Test
    void testSumTwoNegativeNumbersPass() {
        assertEquals(-30,calculator.sum(-10,-20));
    }

    //Calculator.subtract
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

    //Calculator.division
    @Test
    void testDivisionWithZeroPass() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.division(18,0));
        assertEquals("/ by zero", exception.getMessage());
    }

    @Test
    void testDivisionWithNegativeBNumberAndZeroPass() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.division(-18,0));
        assertEquals("/ by zero", exception.getMessage());
    }

    //Extra
    /**
     * This test, tests a protected method.
     */
    @Test
    void testMultiplikationWithPositiveNumbersPass() {
        assertEquals(300,calculator.multiplikation(10,30));
    }

    /**
     * This test, tests a method with default visibility.
     */
    @Test
    void testStringZinsenPass() {
        assertEquals("1459,98", calculator.interest(1200,4,5));
    }

    /**
     * Private methods can't be tested without injecting reflection with Dp4j
     * into the test methods.
     */
}