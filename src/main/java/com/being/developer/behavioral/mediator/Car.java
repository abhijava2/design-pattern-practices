package com.being.developer.behavioral.mediator;

public class Car extends Vehicle {

  public Car(TrafficController trafficController, String vehicleNumber) {
    super(trafficController, vehicleNumber);
  }

  @Override
  public void receive(String message) {
    System.out.println("Car: " + getVehicleNumber() + " received message: " + message);
  }

  @Override
  public void send(String message) {
    System.out.println("Car: " + getVehicleNumber() + " sending message: " + message);
    trafficController.notifyVehicle(message, this);
  }

}
