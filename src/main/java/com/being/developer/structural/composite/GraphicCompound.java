package com.being.developer.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class GraphicCompound {

  private List<Graphic> graphics = new ArrayList<>();

  public void add(Graphic graphic) {
    graphics.add(graphic);
  }

  public void remove(Graphic graphic) {
    graphics.remove(graphic);
  }

  public void move(int x, int y) {
    graphics.forEach(graphic -> graphic.move(x, y));
  }

  public void draw() {
    graphics.forEach(Graphic::draw);
  }
}
