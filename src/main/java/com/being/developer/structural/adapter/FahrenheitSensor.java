package com.being.developer.structural.adapter;

//  adaptee of fahrenheit sensor.
public class FahrenheitSensor {
     
  public double readTemperature() {
       System.out.println("Reading temperature in fahrenheit!");
       return 100;
  }

}