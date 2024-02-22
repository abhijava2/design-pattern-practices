package com.being.developer.behavioral.mediator;
// Colleague: Vehicle

public abstract class Vehicle {
  protected TrafficController trafficController;
  protected String vehicleNumber;

  public Vehicle(TrafficController trafficController, String vehicleNumber) {
    this.trafficController = trafficController;
    this.vehicleNumber = vehicleNumber;
  }

  public abstract void receive(String message);

  public abstract void send(String message);

  public String getVehicleNumber() {
    return vehicleNumber;
  }
}
