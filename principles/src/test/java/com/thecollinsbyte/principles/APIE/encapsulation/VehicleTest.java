package com.thecollinsbyte.principles.APIE.encapsulation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    Vehicle vehicle;

    @BeforeEach
    public void setUp() {
        vehicle = new Vehicle();
    }

    /*
    @Test
    void move() {
        String output = vehicle.move();
        assertEquals("Moving....", output.toLowerCase());
    }

    @Test
    void stop() {
        String output = vehicle.move();
        assertEquals("Stopped....", output.toLowerCase());
    }
    */
}