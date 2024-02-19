package com.being.developer.creational.abstractfactory;

/**
 * abstract Factory:This interface represents an abstract factory for creating vehicles.
 */
public interface VehicleAbstractFactory {
  /**
   * Creates a new instance of a vehicle.
   *
   * @return the created vehicle
   */
  public Vehicle createVehicle();
}
