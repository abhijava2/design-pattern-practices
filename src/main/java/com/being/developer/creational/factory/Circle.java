package com.being.developer.creational.factory;

public class Circle implements Shape {

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public Double calculateArea() {
    System.out.println("This is Circle");
    return (3.14) * this.radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }
}
