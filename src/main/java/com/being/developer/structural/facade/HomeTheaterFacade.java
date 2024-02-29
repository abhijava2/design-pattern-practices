package com.being.developer.structural.facade;

public class HomeTheaterFacade {

  private DVDPlayer dvdPlayer;
  private SoundSystem soundSystem;
  private ProjectorDisplay projectorDisplay;

  public HomeTheaterFacade(DVDPlayer dvdPlayer, SoundSystem soundSystem, ProjectorDisplay projectorDisplay) {
    this.dvdPlayer = dvdPlayer;
    this.soundSystem = soundSystem;
    this.projectorDisplay = projectorDisplay;
  }

  public void watchMovie(String movie) {
    System.out.println("Get ready to watch a movie...");
    dvdPlayer.on();
    projectorDisplay.on();
    soundSystem.on();
    projectorDisplay.connectDVDPlayer(dvdPlayer);
    soundSystem.setVolume(10);
    dvdPlayer.play(movie);
    projectorDisplay.display(movie);
  }

  public void endMovie() {
    System.out.println("Shutting down the home theater...");
    dvdPlayer.stop();
    soundSystem.off();
    projectorDisplay.off();
  }
}
