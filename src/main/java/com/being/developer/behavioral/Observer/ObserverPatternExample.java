package com.being.developer.behavioral.Observer;

// clent code.
public class ObserverPatternExample  {
    public static void main(String[] args) {
        System.out.println("Observer Pattern Example!");
        WeatherStation weatherSubject = new WeatherStation();
        WeatherWidgets weatherWidgets = new WeatherWidgets(weatherSubject);
        weatherSubject.increaseTemperature();
        weatherSubject.decreaseTemperature();

        weatherWidgets.onDestroy();
        // this time there should not be any notification to widgets!
        weatherSubject.increaseTemperature();

    }
}
