package com.designpattern.ekang.observer.builtinclass;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {};

    public void measurementsChanged() {
        setChanged(); // **
        // Notice: not sending a data object with the notifyObservers() call
        // Using PULL model
        notifyObservers();
    }

    public void setMeasurements (float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}
