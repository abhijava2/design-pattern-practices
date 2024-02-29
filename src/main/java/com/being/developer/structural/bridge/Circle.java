package com.being.developer.structural.bridge;
// Refined Abstraction: Circle
public class Circle extends Shape {

  private int x, y, radius;
  public Circle(RenderingAPI renderingAPI) {
    super(renderingAPI);
    this.x = 0;
    this.y = 0;
    this.radius = 1;
  }
  public Circle(int x, int y, int radius, RenderingAPI renderingAPI) {
    super(renderingAPI);
    this.x = x;
    this.y = y;
    this.radius = radius;
  }

  @Override
  public void draw() {
    super.renderingAPI.renderCircle(x, y, radius);
  }

  @Override
  public void resizeByPercentage(double percentage) {
     throw new UnsupportedOperationException("Resize operation is not supported for Circle");
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int getRadius() {
    return radius;
  }

}
