package com.thecollinsbyte.principles.APIE.inheritance;

public class MountainBike extends Bicycle{

    private int height;

    public MountainBike(int gear, int speed, int height){
        super(gear, speed);
        this.height = height;
    }

    public void setHeight(int height) {
        this.height += height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "MountainBike{" +
                "height=" + height +
                '}';
    }
}
