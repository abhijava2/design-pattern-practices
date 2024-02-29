package com.being.developer.structural.composite;

public class CompositePatternExample {
  public static void main(String[] args) {
    Graphic circle = new Circle();
    Graphic triangle = new Triange();
    Graphic square = new Sqaure();

    GraphicCompound graphicCompound = new GraphicCompound();
    graphicCompound.add(circle);
    graphicCompound.add(triangle);
    graphicCompound.add(square);

    graphicCompound.move(2, 3);
    graphicCompound.draw();
  }
}
