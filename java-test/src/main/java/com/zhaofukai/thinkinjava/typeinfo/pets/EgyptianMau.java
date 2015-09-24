//: typeinfo/pets/EgyptianMau.java
package com.zhaofukai.thinkinjava.typeinfo.pets;

public class EgyptianMau extends Cat {
  public EgyptianMau(String name) { super(name); }
  public EgyptianMau() { super(); }
  public static class Factory
          implements com.zhaofukai.thinkinjava.typeinfo.factory.Factory<Pet> {
    public Pet create() {
      return new EgyptianMau();
    }
  }
} ///:~
