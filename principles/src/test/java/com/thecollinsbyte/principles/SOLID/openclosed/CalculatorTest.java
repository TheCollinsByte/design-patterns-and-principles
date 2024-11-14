package com.thecollinsbyte.principles.SOLID.openclosed;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addOperation() {
        AddOperation addOperation = new AddOperation();
        int result = addOperation.calculate(10, 10);

        assertEquals(20, result);
    }

    @Test
    void subtractOperation() {
        SubtractOperation subtractOperation = new SubtractOperation();
        int result = subtractOperation.calculate(10, 10);

        assertEquals(0, result);
    }
}