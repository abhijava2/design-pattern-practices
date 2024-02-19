package com.being.developer.creational.abstractfactory;

/**
 * Concrete Factory:A factory class that creates air transport vehicles.
 */
public class AirTransportVehicleFactory implements VehicleAbstractFactory {
  
    /**
     * Creates an air transport vehicle.
     * 
     * @return The created air transport vehicle.
     */
    @Override
    public Vehicle createVehicle() {
      System.out.println("Creating Air Transport vehicle");
      return new AirTransportVehicle(1200);
    }
}
