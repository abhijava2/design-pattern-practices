package com.being.developer.behavioral.mediator;

public class Bus extends Vehicle {

  public Bus(TrafficController trafficController, String vehicleNumber) {
    super(trafficController, vehicleNumber);

  }

  @Override
  public void receive(String message) {
    System.out.println("Bus: " + getVehicleNumber() + " received message: " + message);
  }

  @Override
  public void send(String message) {
    System.out.println("Bus: " + getVehicleNumber() + " sending message: " + message);
    trafficController.notifyVehicle(message, this);
  }
}
