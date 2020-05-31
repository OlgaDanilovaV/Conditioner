package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConditionerTest {

    @Test
    public void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.increaseCurrentTemperature;
        int expected = 26;
        int actual = conditioner.getCurrentTemperature();

        assertEquals(expected,actual);
    }

    @Test
    public void decreaseCurrentTemperature () {
        Conditioner conditioner = new Conditioner();
        conditioner.decreaseCurrentTemperature;
        int expected = 24;
        int actual = conditioner.getCurrentTemperature();

        assertEquals(expected,actual);
    }
}