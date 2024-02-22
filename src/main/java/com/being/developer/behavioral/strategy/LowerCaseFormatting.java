package com.being.developer.behavioral.strategy;
// Concrete Strategies: LowercaseFormatting
public class LowerCaseFormatting implements TextFormatting{

  @Override
  public String formate(String text) {
    return text.toLowerCase();
  }
  
}
