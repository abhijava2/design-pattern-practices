package com.being.developer.creational.abstractfactory;

/**
 * Concrete Factory:A factory class that creates land transport vehicles.
 */
public class LandTransportVehicleFactory implements VehicleAbstractFactory {
  /**
   * Creates a land transport vehicle.
   * 
   * @return The created land transport vehicle.
   */
  public Vehicle createVehicle() {
    System.out.println("Creating Land Transport vehicle");
    return new LandTransportVehicle(250);
  }
}
