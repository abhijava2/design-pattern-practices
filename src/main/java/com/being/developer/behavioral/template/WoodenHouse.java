package com.being.developer.behavioral.template;
// Concrete Class: WoodenHouse
public class WoodenHouse extends HouseTemplate {

  @Override
  protected void buildWalls() {
    System.out.println("Building wooden walls");
  }

  @Override
  protected void buildPillars() {
    System.out.println("Building wooden pillars with no coating");
  }

  @Override
  protected void buildWindows() {
    System.out.println("Building wooden windows with wooden panes");
  }

  @Override
  protected void buildFoundation() {
    System.out.println("WoodenHouse : Building foundation with iron rods and woods only");
  }

}
