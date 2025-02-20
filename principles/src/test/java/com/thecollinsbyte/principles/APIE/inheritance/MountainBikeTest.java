package com.thecollinsbyte.principles.APIE.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MountainBikeTest {

    @Test
    void speedUpTest() {
        MountainBike mountainBike = new MountainBike(1, 1, 2);

        mountainBike.speedUp(1);
        mountainBike.speedUp(2);

        assertEquals(4, mountainBike.getSpeed());
    }
}