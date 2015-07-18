//: typeinfo/pets/Hamster.java
package com.zhaofukai.thinkinjava.typeinfo.pets;

public class Hamster extends Rodent {
  public Hamster(String name) { super(name); }
  public Hamster() { super(); }
  public static class Factory
          implements com.zhaofukai.thinkinjava.typeinfo.factory.Factory<Pet> {
    public Pet create() {
      return new Hamster();
    }
  }
} ///:~
