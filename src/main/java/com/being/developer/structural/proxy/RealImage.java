package com.being.developer.structural.proxy;
// RealSubject: RealImage represents the actual image
public class RealImage implements Image {

  public RealImage(String fileName) {
    System.out.println("Loading image: " + fileName);
    loadFromDisk(fileName);
  }

  @Override
  public void display() {
    System.out.println("Displaying Image");
  }

  private void loadFromDisk(String fileName) {
    // Simulate loading image from disk
  }
}
