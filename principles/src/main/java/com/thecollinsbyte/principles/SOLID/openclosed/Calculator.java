package com.thecollinsbyte.principles.SOLID.openclosed;

public class Calculator {
    public int calculateNumber(int number1, int number2, Operation operation) {
        return operation.calculate(number1, number2);
    }
}
