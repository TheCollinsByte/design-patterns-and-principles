package com.thecollinsbyte.principles.APIE.abstraction;

/**
 * Abstract
 *      - Abstract Class with abstract methods
 *      - Using interfaces with a generic abstract method
 *
 *      Note: Both concepts of abstraction can be combined
 */
public abstract class AbstractVehicle implements IVehicle {

    abstract public String move();

    public String stop() {
        return "Stopped....";
    }
}
