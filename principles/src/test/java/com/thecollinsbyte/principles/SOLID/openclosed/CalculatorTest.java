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
    void addOperation() {
        double result = calculator.calculate(10, 10, Operator.ADD);
        assertEquals(20, result);
    }

    @Test
    void subtractOperation() {
        double result = calculator.calculate(10, 10, Operator.SUBTRACT);
        assertEquals(0, result);
    }

    @Test
    void multiplyOperation() {
        double result = calculator.calculate(10, 10, Operator.MULTIPLY);
        assertEquals(100, result);
    }

    @Test
    void divideOperation() {
        double result = calculator.calculate(10, 10, Operator.DIVIDE);
        assertEquals(1, result);
    }
}