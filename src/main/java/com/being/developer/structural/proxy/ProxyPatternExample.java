package com.being.developer.structural.proxy;
// Client code
public class ProxyPatternExample {
  public static void main(String[] args) {
    System.out.println("Proxy Pattern Example");
    
    ImageViewerProxy imageViewerProxy = new ImageViewerProxy();
    imageViewerProxy.display("profile.jpg", "Abhay_Singh");
  }
}
