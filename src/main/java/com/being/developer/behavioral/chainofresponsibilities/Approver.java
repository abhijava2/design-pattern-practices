package com.being.developer.behavioral.chainofresponsibilities;

public interface Approver {

 void setNextApprover(Approver nextApprover);
 void approveRequest(PurchaseOrder purchaseOrder);
}
