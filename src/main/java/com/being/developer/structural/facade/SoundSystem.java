package com.being.developer.structural.facade;

public class SoundSystem {
  
  public void on() {
    System.out.println("Sound System is on");
  }
  public void setVolume(int volume) {
    System.out.println("Setting volume to: " + volume);
  }
  public void off() {
    System.out.println("Sound System is off");
  }
}
