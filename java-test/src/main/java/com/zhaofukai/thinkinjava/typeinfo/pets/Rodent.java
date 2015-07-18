//: typeinfo/pets/Rodent.java
package com.zhaofukai.thinkinjava.typeinfo.pets;

public class Rodent extends Pet {
  public Rodent(String name) { super(name); }
  public Rodent() { super(); }
  public static class Factory
          implements com.zhaofukai.thinkinjava.typeinfo.factory.Factory<Pet> {
    public Pet create() {
      return new Rodent();
    }
  }
} ///:~
