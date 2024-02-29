package com.being.developer.structural.bridge;
// Implementor: RenderingAPI
public interface RenderingAPI {
  void renderCircle(int x, int y, int radius);

  void renderRectangle(int x, int y, int width, int height);
}
