package com.being.developer.structural.proxy;

// Proxy: ImageViewerProxy controls access to the RealImage
public class ImageViewerProxy {
  private AuditLog auditLog;

  public ImageViewerProxy() {
    this.auditLog = new AuditLog();
  }

  public void display(String fileName, String userName) {
    RealImage realImage = new RealImage(fileName);
    realImage.display();
    this.auditLog.log("Image Displayed: " + fileName + " by " + userName);
    // similary can keep caching as well based on the requirement!
  }
}
