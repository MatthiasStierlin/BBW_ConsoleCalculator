package ch.bbw.mssz;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Matthias_Stierlin
 * @version 19.01.2020
 */
class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    static void setUp() {
        calculator = new Calculator();
    }

    @Test
    void sumAssertion() {
        assertEquals(30,calculator.sum(10,20));
    }

    @Test
    void subtractAssertion() {
        assertEquals(20,calculator.subtract(30,10));
    }
}