package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConditionerTest {

    @Test
    public void increaseCurrentTemperature() {

        Conditioner conditioner = new Conditioner();
        conditioner.setName("TheBestConditioner");
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(20);
        conditioner.setCurrentTemperature(30);
        conditioner.setOn(true);

        conditioner.increaseCurrentTemperature(conditioner.getCurrentTemperature() +1);

        assertEquals(30,conditioner.increaseCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperature () {

        Conditioner conditioner = new Conditioner();
        conditioner.setName("TheBestConditioner");
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(20);
        conditioner.setCurrentTemperature(20);
        conditioner.setOn(true);

        conditioner.setCurrentTemperature(conditioner.getCurrentTemperature() -1);

        assertEquals(20,conditioner.getCurrentTemperature());
    }
}