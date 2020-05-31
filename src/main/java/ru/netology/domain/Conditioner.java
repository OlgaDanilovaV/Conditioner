package ru.netology.domain;

public class Conditioner {
    private String name;
    private int maxTemperature = 29;
    private int minTemperature = 19;
    private int currentTemperature = 25;
    private boolean on = true;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void increaseCurrentTemperature() {
        if (!on) {
            return;
        }
        if (currentTemperature < maxTemperature) {
            currentTemperature ++;
        }
    }

    public void decreaseCurrentTemperature () {
        if (!on) {
            return;
        }
        if (currentTemperature > minTemperature) {
            currentTemperature --;
        }
    }
}

