package com.being.developer.structural.bridge;
// Refine Abstraction Rectangle
public class Rectangle extends Shape {
  private int x, y, width, height;

  public Rectangle(RenderingAPI renderingAPI) {
    super(renderingAPI);
    this.x = 0;
    this.y = 0;
    this.width = 1;
    this.height = 1;
  }

  public Rectangle(int x, int y, int width, int height, RenderingAPI renderingAPI) {
    super(renderingAPI);
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  @Override
  public void draw() {
    super.renderingAPI.renderRectangle(x, y, width, height);
  }

  @Override
  public void resizeByPercentage(double percentage) {

    throw new UnsupportedOperationException("Resize operation is not supported for Rectangle");

  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

}
