package com.being.developer.creational.prototype;

// Prototype manager class
public class VehiclePrototype {
    // Get a cloned vehicle instance based on the given type.
    public static Vehicle getNewVehicle(Vehicle vehicle) {
        return vehicle.clone();
    }
}