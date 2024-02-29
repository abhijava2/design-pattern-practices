package com.being.developer.structural.composite;

public class Circle implements Graphic{
  public void move(int x, int y) {
    System.out.println("Circle moved to x: " + x + " and y: " + y);
  }

  public void draw() {
    System.out.println("Circle drawn");
  }
}
