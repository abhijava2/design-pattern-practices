package com.being.developer.structural.bridge;
// Abstraction: Shape
public abstract class Shape {

  protected RenderingAPI renderingAPI;

  public Shape(RenderingAPI renderingAPI) {
    this.renderingAPI = renderingAPI;
  }

  public abstract void draw();

  public abstract void resizeByPercentage(double percentage);
}
