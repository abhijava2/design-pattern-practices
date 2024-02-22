package com.being.developer.behavioral.strategy;
// Context: TextEditor
public class TextEditor {
  private TextFormatting textTransformation;

  public TextEditor(TextFormatting textTransformation) {
    this.textTransformation = textTransformation;
  }

  public void setTextTransformation(TextFormatting textTransformation) {
    this.textTransformation = textTransformation;
  }

  public String applyFormatting(String text) {
    return textTransformation.formate(text);
  }

}
