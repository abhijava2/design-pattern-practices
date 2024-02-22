package com.being.developer.behavioral.chainofresponsibilities;

public class ChainOfResponsibilitiesExample {
  public static void main(String[] args) {
    System.out.println("Chain of Responsibilities Example");
    Approver adminApprover = new AdminApprover(null);
    Approver managerApprover = new ManagerApprover(adminApprover);

    PurchaseOrder purchaseOrder1 = new PurchaseOrder(100);
    managerApprover.approveRequest(purchaseOrder1);
    System.out.println(purchaseOrder1.isApproved() ? "Approved" : "Not Approved");
    System.out.println("=====================================");

    // in this case is should be approved by Admin which is next to manager.
    PurchaseOrder purchaseOrder2 = new PurchaseOrder(1200);
    managerApprover.approveRequest(purchaseOrder2);
    System.out.println(purchaseOrder2.isApproved() ? "Approved" : "Not Approved");
    System.out.println("=====================================");

    
    PurchaseOrder purchaseOrder3 = new PurchaseOrder(12000);
    managerApprover.approveRequest(purchaseOrder3);
    System.out.println(purchaseOrder3.isApproved() ? "Approved" : "Not Approved");
  }
}
