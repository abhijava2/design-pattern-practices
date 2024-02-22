package com.being.developer.behavioral.mediator;

// Mediator Pattern Example
// client
public class MediatorPatternExample {
  public static void main(String[] args) {
    System.out.println("Mediator Pattern Example");
    TrafficController trafficController = new TrafficTower();
    Vehicle car = new Car(trafficController, "KA-01-HH-1234");
    Vehicle bus = new Bus(trafficController, "KA-01-HH-9999");

    // can do this registerVehicle in constructor of car and bus
    trafficController.registerVehicle(car);
    trafficController.registerVehicle(bus);

    car.send("Hello Bangalore");
    bus.send("Welcome to Bangalore");

  }
}
