package com.thecollinsbyte.principles.SOLID.openclosed;

public class AddOperation implements Operation {

    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}
