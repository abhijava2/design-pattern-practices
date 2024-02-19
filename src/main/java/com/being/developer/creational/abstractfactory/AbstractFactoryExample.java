package com.being.developer.creational.abstractfactory;

// Client
public class AbstractFactoryExample {
  
  public static void main(String[] args) {
    VehicleAbstractFactory airVehicleFactory = VehicleFactory.getVehicleFactory("Air");
    Vehicle airVehicle = airVehicleFactory.createVehicle();
    airVehicle.start();
    airVehicle.stop();

    System.out.println("====================================="); 
    VehicleAbstractFactory fieldVehicleFactory = VehicleFactory.getVehicleFactory("Land");
    Vehicle fieldVehicle = fieldVehicleFactory.createVehicle();
    fieldVehicle.start();
    fieldVehicle.stop();
  }
}
