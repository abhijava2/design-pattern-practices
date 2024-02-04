package com.being.developer.creational.singletone;

/** SingletonExample! */
public final class SingletonExample {
  private SingletonExample() {}

  /**
   * SingletonExample Running class.
   *
   * @param args The arguments of the program.
   */
  public static void main(String[] args) {
    Order instance1 = Order.getInstance();
    Order instance2 = Order.getInstance();

    if (instance1 == instance2) {
      System.out.println("Both are same object");
    } else {
      System.out.println("Both are not same object");
    }
  }
}
