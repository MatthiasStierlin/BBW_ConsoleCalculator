package ch.bbw.mssz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.lang.management.MonitorInfo;

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

    @Test
    void testSubtractTwoPositiveNumbersPass() {
        assertEquals(20,calculator.subtract(30,10));
    }

    @Test
    void testSubtractOneNegativeAndOnePositiveNumberPass() {
        assertEquals(30,calculator.subtract(20,-10));
    }

    @Test
    void testSubtractOnePositiveNumberAndZeroPass() {
        assertEquals(30,calculator.subtract(30,0));
    }

    @Test
    void testSubtractMaxValueAndMinValuePass(){
        assertEquals(-1,calculator.subtract(Integer.MAX_VALUE,Integer.MIN_VALUE));
    }

    @Test
    void testSubtractMaxValueAndPositiveNumberPass() {
        assertEquals(2147483629,calculator.subtract(Integer.MAX_VALUE,18));
    }

    @Test
    void testSubtractMaxValueAndNegativeNumberPass() {
        assertEquals(-2147483631,calculator.subtract(Integer.MAX_VALUE,-18));
    }

    @Test
    void testSubtractMinValueAndPositiveNumberPass() {
        assertEquals(2147483630,calculator.subtract(Integer.MIN_VALUE,18));
    }

    @Test
    void testSubtractMinValueAndNegativeNumberPass() {
        assertEquals(-2147483630,calculator.subtract(Integer.MIN_VALUE,-18));
    }

    @Test
    void testSubtractTwoNegativeNumbersPass() {
        assertEquals(-20, calculator.subtract(-30,-10));
    }

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

    @Test
    void testDivisionTwoPositiveNumbersPass() {
        assertEquals(10,calculator.division(100,10));
    }

    @Test
    void testDivisionOnePositiveAndNegativeNumberPass() {
        assertEquals(-10,calculator.division(100,-10));
    }

    @Test
    void testDivisionTwoNegativeNumbersPass() {
        assertEquals(10,calculator.division(-100,-10));
    }

    @Test
    void testDivisionOnePositiveNumberAndMaxValuePass() {
        assertEquals(214748364,calculator.division(Integer.MAX_VALUE,10));
    }

    @Test
    void testDivisionOneNegativeNumberAndMaxValuePass() {
        assertEquals(-214748364,calculator.division(Integer.MAX_VALUE,-10));
    }

    @Test
    void testDivisionOnePositiveNumberAndMinValuePass() {
        assertEquals(-214748364,calculator.division(Integer.MIN_VALUE,10));
    }

    @Test
    void testDivisionOneNegativeNumberAndMinValuePass() {
        assertEquals(214748364,calculator.division(Integer.MIN_VALUE,-10));
    }

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
     * Just because a test passes once, that doesnt mean that it always pass.
     */
    @RepeatedTest(10)
    void testStringZinsenTenTimesPass() {
        assertEquals("1459,98", calculator.interest(1200,4,5));
    }

    /**
     * Private methods can't be tested without injecting reflection with Dp4j
     * into the test methods.
     */
}