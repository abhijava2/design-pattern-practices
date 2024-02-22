package com.being.developer.behavioral.template;
//  Concrete Class: GlassHouse
public class GlassHouse extends HouseTemplate {

  @Override
  protected void buildWalls() {
    System.out.println("Building cement walls with glass coating");
  }

  @Override
  protected void buildPillars() {
    System.out.println("Building cement pillars with glass coating");
  }

  @Override
  protected void buildWindows() {
    System.out.println("Building iron windows with glass panes");
  }

  
}
