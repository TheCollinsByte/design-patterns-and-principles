package com.thecollinsbyte.principles.SOLID.openclosed;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private final Map<Operator, Operation> operations = new HashMap<>();

    public void addOperation(Operator operator, Operation operation) {
        operations.put(operator, operation);
    }

    public double calculate(double number1, double number2, Operator operator) {
        Operation operation = operations.get(operator);
        if (operation == null) {
            throw new UnsupportedOperationException("Operation not supported: ");
        }
        return operation.calculate(number1, number2);
    }
}
