package com.being.developer.creational.factory;

import com.being.developer.creational.factory.Shape.ShapeType;

public class FactoryPatternExample {
  public static void main(String[] args) {

    System.out.println("Factory PatternExample !");

    Shape rectangle = ShapeFactory.createShape(ShapeType.RECTANGLE.toString());
    System.out.println(rectangle.calculateArea());

    Circle circle = (Circle) ShapeFactory.createShape(ShapeType.CIRCLE.toString());
    System.out.println(circle.calculateArea());

    // reset the size of circle and check new area.
    circle.setRadius(20);
    System.out.println(circle.calculateArea());
  }
}
