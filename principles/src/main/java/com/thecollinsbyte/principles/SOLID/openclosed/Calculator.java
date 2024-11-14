package com.thecollinsbyte.principles.SOLID.openclosed;

public class Calculator {
    public double calculateNumber(double number1, double number2, Operation operation) {
        return operation.calculate(number1, number2);
    }
}
