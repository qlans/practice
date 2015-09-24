//: typeinfo/pets/Pug.java
package com.zhaofukai.thinkinjava.typeinfo.pets;

public class Pug extends Dog {
  public Pug(String name) { super(name); }
  public Pug() { super(); }
  public static class Factory
          implements com.zhaofukai.thinkinjava.typeinfo.factory.Factory<Pet> {
    public Pet create() {
      return new Pug();
    }
  }
} ///:~
