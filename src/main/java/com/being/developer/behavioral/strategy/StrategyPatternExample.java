package com.being.developer.behavioral.strategy;

// Client code
public class StrategyPatternExample {
  public static void main(String[] args) {
    System.out.println("Strategy Pattern Example");

    TextEditor lowerCaseEditor = new TextEditor(new LowerCaseFormatting());
    System.out.println(lowerCaseEditor.applyFormatting("Hello World"));

    TextEditor upperCaseEditor = new TextEditor(new UpperCaseFormatting());
    System.out.println(upperCaseEditor.applyFormatting("Hello World"));

    // another way.
    // Side note in strategy pattern object need to re-create or update with new
    // strategy at runtime.
    TextEditor textEditor = new TextEditor(new LowerCaseFormatting());
    System.out.println(textEditor.applyFormatting("Hello Java"));

    textEditor.setTextTransformation(new UpperCaseFormatting());

    System.out.println(textEditor.applyFormatting("Hello JAVA"));

  }
}
