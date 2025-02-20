package com.thecollinsbyte.principles.APIE.encapsulation;

public class Vehicle {
    private boolean moving;

    public String move() {
        this.moving = true;
        return "Moving....";
    }

    public String stop() {
        this.moving = false;
        return "Stopped....";
    }
}
