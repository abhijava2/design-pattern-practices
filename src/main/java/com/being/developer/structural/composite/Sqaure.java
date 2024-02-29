package com.being.developer.structural.composite;

public class Sqaure implements Graphic {

  @Override
  public void move(int x, int y) {
    System.out.println("Sqaure moved to x: " + x + " and y: " + y);
  }

  @Override
  public void draw() {
    System.out.println("Sqaure drawn");
  }

}
