package com.thecollinsbyte.principles.SOLID.openclosed;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        calculator.addOperation(Operator.ADD, new AddOperation());
        calculator.addOperation(Operator.SUBTRACT, new SubtractOperation());
        calculator.addOperation(Operator.MULTIPLY, new MultiplicationOperation());
        calculator.addOperation(Operator.DIVIDE, new DivisionOperation());
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
}