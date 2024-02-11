package com.being.developer.creational.prototype;

// Concrete implementation of the Vehicle interface
class Car implements Vehicle {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Copy constructor
    public Car(Car car) {
        this.make = car.make;
        this.model = car.model;
        this.year = car.year;
    }

    // Clone method using copy constructor
    @Override
    public Vehicle clone() {
        return new Car(this);
    }

    // Getters and setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}