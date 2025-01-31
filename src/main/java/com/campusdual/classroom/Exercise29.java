package com.campusdual.classroom;

public class Exercise29 {
  public static void main(String[] args) {
    try {
      Integer.parseInt("a");
    } catch (NumberFormatException e) {
      System.out.print("ERROR: La string no es un número");
    }
  }
}
