package com.being.developer.structural.adapter;

// Client code using the CelsiusSensor interface

public class AdapterPatternExample {
     public static void main(String[] args) {
          System.out.println("Adapter Pattern Example!");
          CelciusSensor celciusSensorImpl = new FahrenheitToCelsiusAdapter(new FahrenheitSensor());
          System.out.println("Temperature in celcius: " + celciusSensorImpl.readTemperature());
     }
}
