package com.thecollinsbyte.principles.SOLID.openclosed;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        calculator.addOperation(Operator.ADD, new Addition());
        calculator.addOperation(Operator.SUBTRACT, new Subtraction());
        calculator.addOperation(Operator.MULTIPLY, new Multiplication());
        calculator.addOperation(Operator.DIVIDE, new Division());
    }

    @Test
    void testAddition() {
        double result = calculator.calculate(10, 10, Operator.ADD);
        assertEquals(20, result, "");
    }

    @Test
    void testSubtraction() {
        double result = calculator.calculate(10, 10, Operator.SUBTRACT);
        assertEquals(0, result);
    }

    @Test
    void testMultiplication() {
        double result = calculator.calculate(10, 10, Operator.MULTIPLY);
        assertEquals(100, result);
    }

    @Test
    void testDivision() {
        double result = calculator.calculate(10, 10, Operator.DIVIDE);
        assertEquals(1, result);
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.calculate(6, 0, Operator.DIVIDE);
        });
        assertEquals("Division by zero", exception.getMessage());
    }

    @Test
    void testUnsupportedOperation() {
        Exception exception = assertThrows(UnsupportedOperationException.class, () -> {
            calculator.calculate(5, 3, null);
        });
        assertEquals("Operation not supported: ", exception.getMessage());
    }
}