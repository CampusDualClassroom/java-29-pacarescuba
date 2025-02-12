package com.campusdual.classroom;

public class Exercise29 {
  public static void main(String[] args) {
    try {
      Integer.parseInt("a");
    } catch (NumberFormatException e) {
      e.printStackTrace();
    }
  }
}
