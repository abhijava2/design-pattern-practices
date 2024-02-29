package com.being.developer.structural.decorator;

//  decorator of luxury car.
public class LuxuryCar implements Car {

     private Car car;

     public LuxuryCar(Car car) {
          this.car = car;
     }

     @Override
     public void assemble() {
          car.assemble();
          System.out.println("Adding features of luxury car!");        
     }
     
}
