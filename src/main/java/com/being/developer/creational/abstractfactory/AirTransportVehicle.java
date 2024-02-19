package com.being.developer.creational.abstractfactory;

/**
 * Represents an air transport vehicle.
 */
public class AirTransportVehicle implements Vehicle {

  private int maxSpeed;

  // other properties

  @Override
  public void start() {
    System.out.println("Air Transport vehicle started");
  }

  /**
   * Concrete Products: Constructs an AirTransportVehicle object with the specified maximum speed.
   * 
   * @param maxSpeed the maximum speed of the air transport vehicle
   */
  public AirTransportVehicle(int maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  @Override
  public void stop() {
    System.out.println("Air Transport vehicle stopped");

  }

  /**
   * Gets the maximum speed of the air transport vehicle.
   * 
   * @return the maximum speed of the air transport vehicle
   */
  public int getMaxSpeed() {
    return maxSpeed;
  }

}
