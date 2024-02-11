package com.being.developer.creational.prototype;

public class PrototypePatternExample {

    public static void main(String[] args) {
        System.out.println();
        Car car1 = new Car("Toyota", "Corolla", 2022);
        Car car2 = (Car) VehiclePrototype.getNewVehicle(car1);

        // Modify car1
        car1.setYear(2023);

        // Output to demonstrate prototype pattern and here car2 should not get changed
        // when car 1 props values modified.
        System.out.println("Car 1: " + car1.getMake() + " " + car1.getModel() + " " + car1.getYear());
        System.out.println("Car 2: " + car2.getMake() + " " + car2.getModel() + " " + car2.getYear());

        // can use copy constrcutior of car class direcly here if not have any special
        // use case handling when creating car object.
        Car car3 = new Car("BMW", "Z4 M40i", 2024);
        Car car4 = new Car(car3);

        System.out.println("Car 3: " + car3.getMake() + " " + car3.getModel() + " " + car3.getYear());
        System.out.println("Car 4: " + car4.getMake() + " " + car4.getModel() + " " + car4.getYear());
    }
}
