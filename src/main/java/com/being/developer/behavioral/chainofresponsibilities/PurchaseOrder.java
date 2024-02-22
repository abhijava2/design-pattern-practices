package com.being.developer.behavioral.chainofresponsibilities;

public class PurchaseOrder {
  private double amount;
  private boolean approved;
  
  public PurchaseOrder(double amount) {
    this.amount = amount;
  }

  public double getAmount() {
    return amount;
  }

  public boolean isApproved() {
    return approved;
  }

  public void setApproved(boolean approved) {
    this.approved = approved;
  }
  
   
}
