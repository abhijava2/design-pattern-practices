package com.being.developer.creational.factory;

import com.being.developer.creational.factory.Shape.ShapeType;

public class ShapeFactory {

  public static Shape createShape(String shapeType) {
    if (ShapeType.CIRCLE.toString().equals(shapeType)) {
      return new Circle(10);
    } else if (ShapeType.RECTANGLE.toString().equals(shapeType)) {
      return new Rectangle(10, 20);
    } else if (ShapeType.SQUARE.toString().equals(shapeType)) {
      return new Square(10);
    }
    throw new IllegalArgumentException("Invalid shapeType passed in argument!");
  }
}
