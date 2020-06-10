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
        conditioner.setCurrentTemperature(25);
        conditioner.increaseCurrentTemperature();
        conditioner.setOn(true);

        assertEquals(26,conditioner.getCurrentTemperature());
    }

    @Test
    public void returnIncreaseCurrentTemperature() {

        Conditioner conditioner = new Conditioner();
        conditioner.setName("TheBestConditioner");
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(20);
        conditioner.setCurrentTemperature(30);
        conditioner.increaseCurrentTemperature();
        conditioner.setOn(true);

        assertEquals(30,conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperature() {

        Conditioner conditioner = new Conditioner();
        conditioner.setName("TheBestConditioner");
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(20);
        conditioner.setCurrentTemperature(25);
        conditioner.decreaseCurrentTemperature();
        conditioner.setOn(true);

        assertEquals(24,conditioner.getCurrentTemperature());
    }

    @Test
    public void returnDecreaseCurrentTemperature() {

        Conditioner conditioner = new Conditioner();
        conditioner.setName("TheBestConditioner");
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(20);
        conditioner.setCurrentTemperature(20);
        conditioner.decreaseCurrentTemperature();
        conditioner.setOn(true);

        assertEquals(20,conditioner.getCurrentTemperature());
    }
}