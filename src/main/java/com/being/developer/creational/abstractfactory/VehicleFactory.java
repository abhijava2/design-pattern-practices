package com.being.developer.creational.abstractfactory;

/**
 * The VehicleFactory class is responsible for creating instances of VehicleAbstractFactory based on the given type.
 */
public class VehicleFactory {

  /**
   * Returns an instance of VehicleAbstractFactory based on the given type.
   *
   * @param type the type of vehicle factory to create (e.g., "Air", "Land", "Marine")
   * @return an instance of VehicleAbstractFactory
   */
  public static VehicleAbstractFactory getVehicleFactory(String type) {
    if (type.equals("Air")) {
      return new AirTransportVehicleFactory();
    } else if (type.equals("Land")) {
      return new LandTransportVehicleFactory();
    } else if (type.equals("Marine")) {
      return new MarineTransportVehicleFactory();
    }
    return null;
  }
}
