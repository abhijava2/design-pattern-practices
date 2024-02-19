package com.being.developer.creational.abstractfactory;

/**
 * Concrete Products: Represents a marine transport vehicle.
 */
public class MarineTransportVehicle implements Vehicle {
  private int maxSpeed;

  // other properties

  @Override
  public void start() {
    System.out.println("Marine Transport vehicle started");
  }

  /**
   * Constructs a marine transport vehicle with the specified maximum speed.
   * 
   * @param maxSpeed the maximum speed of the marine transport vehicle
   */
  public MarineTransportVehicle(int maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  @Override
  public void stop() {
    System.out.println("Marine Transport vehicle stopped");
  }

  /**
   * Gets the maximum speed of the marine transport vehicle.
   * 
   * @return the maximum speed of the marine transport vehicle
   */
  public int getMaxSpeed() {
    return maxSpeed;
  }
}
