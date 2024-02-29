package com.being.developer.structural.adapter;

// Adapter: FahrenheitToCelsiusAdapter
public class FahrenheitToCelsiusAdapter implements CelciusSensor {

     private FahrenheitSensor fahrenheitSensor;

     public FahrenheitToCelsiusAdapter(FahrenheitSensor fahrenheitSensor) {
          this.fahrenheitSensor = fahrenheitSensor;
     }
     
     @Override
     public double readTemperature() {
          double  temperature= fahrenheitSensor.readTemperature();
          return (temperature-32)*5/9;
     }
     
}
