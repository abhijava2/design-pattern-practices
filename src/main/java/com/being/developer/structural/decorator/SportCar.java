package com.being.developer.structural.decorator;

// decorator of sport car.
public class SportCar implements Car {
     private Car car;
     public SportCar     (Car car) {
        this.car = car;
     }

     @Override
     public void assemble() {
        car.assemble();
        System.out.println("Adding features of sport car!");
        
     }
     
}
