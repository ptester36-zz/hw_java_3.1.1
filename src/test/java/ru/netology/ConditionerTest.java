package ru.netology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
 @Test
    void increaseCurrentTemperatureTest() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(20);
        conditioner.setIncreaseCurrentTemperature(10);
        assertEquals(20, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperatureTest() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(0);
        conditioner.setDecreaseCurrentTemperature(10);
        assertEquals(0, conditioner.getCurrentTemperature());
    }
}