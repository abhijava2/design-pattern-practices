package com.being.developer.structural.bridge;
// Client code
public class BridgePatternExample {
  public static void main(String[] args) {
    System.out.println("Bridge Pattern Example");
    RenderingAPI rasterRenderingAPI = new RasterRenderingImpl();
    RenderingAPI vectorRenderingAPI = new VectorRenderingImpl();
    Shape circle = new Circle(5, 10, 10, rasterRenderingAPI);
    Shape rectangle = new Rectangle(10, 20, 30, 40, vectorRenderingAPI);

    circle.draw();
    rectangle.draw();

  }
}
