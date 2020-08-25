package ru.netology;

public class Conditioner {

    private String name;
    private int maxTemperature;
    private int minTemperature;
    private boolean on;
    private int currentTemperature;

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }


    public void setIncreaseCurrentTemperature(int currentTemperature) {

        for (int x = currentTemperature; x <= maxTemperature; x++) {
            currentTemperature = x;
        }
        this.currentTemperature = currentTemperature;
    }

    public void setDecreaseCurrentTemperature(int currentTemperature) {

        for (int x = currentTemperature; x >= minTemperature; x--) {
            currentTemperature = x;
        }
        this.currentTemperature = currentTemperature;
    }

}
