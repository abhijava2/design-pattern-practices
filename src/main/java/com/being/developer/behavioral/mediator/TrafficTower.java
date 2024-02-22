package com.being.developer.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;
// Concrete Mediator: TrafficTower

public class TrafficTower implements TrafficController {
  private List<Vehicle> vehicles;

  public TrafficTower() {
    this.vehicles = new ArrayList<>();
  }

  @Override
  public void registerVehicle(Vehicle vehicle) {
    this.vehicles.add(vehicle);
  }

  @Override
  public void notifyVehicle(String message, Vehicle vehicle) {

    for (Vehicle v : vehicles) {
      if (v != vehicle) {
        v.receive(message);
      }
    }

  }

}
