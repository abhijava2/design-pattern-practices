package com.being.developer.creational.factory;

public interface Shape {
  Double calculateArea();

  enum ShapeType {
    CIRCLE,
    RECTANGLE,
    SQUARE;
  }
}
