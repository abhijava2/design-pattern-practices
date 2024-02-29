package com.being.developer.structural.facade;

public class ProjectorDisplay {
  
  public void on() {
    System.out.println("Projector is on");
  }
  public void display(String movie) {
    System.out.println("Displaying movie: " + movie);
  }
  public void off() {
    System.out.println("Projector is off");
  }

  public boolean connectDVDPlayer(DVDPlayer dvdPlayer) {
    System.out.println("Connecting DVD Player to Projector");
    
    return true;
  }
}
