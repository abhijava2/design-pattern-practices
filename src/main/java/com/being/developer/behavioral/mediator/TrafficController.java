package com.being.developer.behavioral.mediator;

// Mediator: TrafficController

public interface TrafficController {
  
  public void registerVehicle(Vehicle vehicle);

  public void notifyVehicle(String message, Vehicle vehicle);

}
