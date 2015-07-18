//: typeinfo/pets/Cymric.java
package com.zhaofukai.thinkinjava.typeinfo.pets;

public class Cymric extends Manx {
  public Cymric(String name) { super(name); }
  public Cymric() { super(); }
  public static class Factory
          implements com.zhaofukai.thinkinjava.typeinfo.factory.Factory<Pet> {
    public Pet create() {
      return new Cymric();
    }
  }
} ///:~
