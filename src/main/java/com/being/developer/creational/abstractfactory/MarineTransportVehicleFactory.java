package com.being.developer.creational.abstractfactory;

/**
 * Concrete Factory: A factory class that creates marine transport vehicles.
 */
public class MarineTransportVehicleFactory implements VehicleAbstractFactory{
  
  /**
   * Creates a marine transport vehicle.
   * 
   * @return The created marine transport vehicle.
   */
  @Override
  public Vehicle createVehicle() {
    System.out.println("Creating Marine Transport vehicle");
    return new MarineTransportVehicle(80);
  }
  
}
