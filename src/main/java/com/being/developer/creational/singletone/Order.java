package com.being.developer.creational.singletone;

public class Order {
  private static final Object MUTEX = new Object();
  private static Order order = null;
  private Order() {}

  public static Order getInstance() {
    if (order == null) {
      synchronized (MUTEX) {
        if (order == null) {
          order = new Order();
          return order;
        }
      }
    }
    return order;
  }
}
