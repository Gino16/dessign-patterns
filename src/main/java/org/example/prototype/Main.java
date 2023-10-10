package org.example.prototype;

public class Main {

  public static void main(String[] args) throws CloneNotSupportedException {

    Swordsman swordsman = new Swordsman();
    swordsman.move(10, 5);
    swordsman.attack();
    System.out.println(swordsman);

    Swordsman swordsman2 = (Swordsman) swordsman.clone();
    System.out.println("Cloned swordsman: " + swordsman2);

  }
}
