package com.being.developer.behavioral.template;

public class TemplatePatternExample {
  public static void main(String[] args) {
    System.out.println("Template Pattern Example");

    HouseTemplate woodenHouse = new WoodenHouse();
    woodenHouse.buildHouse();

    System.out.println("************");
    
    HouseTemplate glassHouse = new GlassHouse();
    glassHouse.buildHouse();
  }
}
