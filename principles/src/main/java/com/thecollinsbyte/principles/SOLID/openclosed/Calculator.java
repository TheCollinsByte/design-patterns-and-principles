package com.thecollinsbyte.principles.SOLID.openclosed;

public class Calculator {
    public int calculateNumber(int number1, int number2, Operation operation) {
        return operation.perform(number1, number2);
    }
}
