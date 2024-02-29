package com.being.developer.structural.decorator;

public class DecoratorPattenExample {

     public static void main(String[] args) {
          System.out.println("Decorator Pattern Example!");
          // create a simple car.
          Car car = new BaseCar();
          // create a sport car.
          Car sportCar = new SportCar(car);
          sportCar.assemble();

          // create a luxury car.
          Car luxuryCar = new LuxuryCar(car);
          luxuryCar.assemble();
     }
}
