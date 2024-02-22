package com.being.developer.behavioral.strategy;
// Concrete Strategies: UppercaseFormatting
public class UpperCaseFormatting implements TextFormatting{

  @Override
  public String formate(String text) {
    return text.toUpperCase();
  }
  
}
