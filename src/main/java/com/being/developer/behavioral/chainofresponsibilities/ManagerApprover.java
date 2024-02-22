package com.being.developer.behavioral.chainofresponsibilities;

public class ManagerApprover implements Approver {
  private Approver nextApprover;

  public ManagerApprover(Approver nextApprover) {
    this.nextApprover = nextApprover;
  }

  @Override
  public void approveRequest(PurchaseOrder purchaseOrder) {
    // Implement the logic to approve the purchase order
    if (purchaseOrder.getAmount() >= 1 && purchaseOrder.getAmount() < 1000) {
      System.out.println("Manager has approved the purchase order of amount: " + purchaseOrder.getAmount());
      purchaseOrder.setApproved(true);
    } else if (nextApprover != null) {
      nextApprover.approveRequest(purchaseOrder);
    }
  }

  @Override
  public void setNextApprover(Approver nextApprover) {
    // Implement the logic to set the next approver
    this.nextApprover = nextApprover;
  }
}
