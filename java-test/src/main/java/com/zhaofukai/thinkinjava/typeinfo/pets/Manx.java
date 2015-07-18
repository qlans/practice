//: typeinfo/pets/Manx.java
package com.zhaofukai.thinkinjava.typeinfo.pets;

public class Manx extends Cat {
  public Manx(String name) { super(name); }
  public Manx() { super(); }
  public static class Factory
          implements com.zhaofukai.thinkinjava.typeinfo.factory.Factory<Pet> {
    public Pet create() {
      return new Manx();
    }
  }
} ///:~
