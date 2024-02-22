package com.being.developer.behavioral.template;
// Abstract class: HouseTemplate
public abstract class HouseTemplate {

  protected abstract void buildWalls();

  protected abstract void buildPillars();

  protected abstract void buildWindows();

  protected void buildFoundation() {
    System.out.println("Building foundation with cement, iron rods and sand");
  };
 // template method
  public final void buildHouse() {
    buildFoundation();
    buildPillars();
    buildWalls();
    buildWindows();
  }

}
