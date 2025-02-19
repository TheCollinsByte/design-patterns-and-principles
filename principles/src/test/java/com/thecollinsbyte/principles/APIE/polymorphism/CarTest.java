package com.thecollinsbyte.principles.APIE.polymorphism;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    public void moveTest() {
        Vehicle vehicle = new Car();
        assertEquals("moving faster.....", vehicle.move());
    }

}