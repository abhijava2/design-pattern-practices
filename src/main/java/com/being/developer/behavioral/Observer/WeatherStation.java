package com.being.developer.behavioral.Observer;

import java.util.ArrayList;
import java.util.List;
// concrete subject impl
public class WeatherStation implements Station {

    private List<Observer> observers = new ArrayList<>();

    private float temperature = 0;

    @Override
    public void registerMe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unRegisterMe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendNotification() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void increaseTemperature() {
        this.temperature++;
        sendNotification();
    }

    public void decreaseTemperature() {
        this.temperature--;
        sendNotification();
    }

    public float getTemperature() {
        return this.temperature;
    }

}
