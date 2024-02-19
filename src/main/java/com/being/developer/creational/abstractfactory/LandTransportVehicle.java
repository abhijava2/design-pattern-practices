package com.being.developer.creational.abstractfactory;

/**
 * Concrete Products: Represents a land transport vehicle.
 */
public class LandTransportVehicle implements Vehicle {

  private int maxSpeed;

  // other properties

  @Override
  public void start() {
    System.out.println("Land Transport vehicle started");
  }

  /**
   * Constructs a new LandTransportVehicle with the specified maximum speed.
   * 
   * @param maxSpeed the maximum speed of the vehicle
   */
  public LandTransportVehicle(int maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  @Override
  public void stop() {
    System.out.println("Land Transport vehicle stopped");

  }

  /**
   * Gets the maximum speed of the vehicle.
   * 
   * @return the maximum speed of the vehicle
   */
  public int getMaxSpeed() {
    return maxSpeed;
  }

}
