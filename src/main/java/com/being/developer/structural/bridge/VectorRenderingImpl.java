package com.being.developer.structural.bridge;
// Concrete Implementor: VectorRendering

public class VectorRenderingImpl implements RenderingAPI {

     @Override
     public void renderCircle(int x, int y, int radius) {
          System.out.println("Drawing a circle at (" + x + ", " + y + ") with radius " + radius);
     }

     @Override
     public void renderRectangle(int x, int y, int width, int height) {
         System.out.println("Drawing a rectangle at (" + x + ", " + y + ") with width " + width + " and height " + height);
     }
     
}
