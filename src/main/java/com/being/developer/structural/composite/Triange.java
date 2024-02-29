package com.being.developer.structural.composite;

public class Triange implements Graphic {
  public void move(int x, int y) {
    System.out.println("Triange moved to x: " + x + " and y: " + y);
  }

  public void draw() {
    System.out.println("Triange drawn");
  }
}
