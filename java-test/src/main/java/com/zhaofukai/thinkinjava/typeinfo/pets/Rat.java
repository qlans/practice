//: typeinfo/pets/Rat.java
package com.zhaofukai.thinkinjava.typeinfo.pets;

public class Rat extends Rodent {
  public Rat(String name) { super(name); }
  public Rat() { super(); }
  public static class Factory
          implements com.zhaofukai.thinkinjava.typeinfo.factory.Factory<Pet> {
    public Pet create() {
      return new Pug();
    }
  }
} ///:~
