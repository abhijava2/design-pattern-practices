package com.being.developer.structural.facade;

public class FacadePatternExample {
  public static void main(String[] args) {
    System.out.println("Facade Pattern Example");
    HomeTheaterFacade homeTheater = new HomeTheaterFacade( new DVDPlayer(),  new SoundSystem(),new ProjectorDisplay());
    homeTheater.watchMovie("The Dark Knight");
    homeTheater.endMovie();
  }
}
