//: typeinfo/pets/Dog.java
package com.zhaofukai.thinkinjava.typeinfo.pets;

public class Dog extends Pet {
  public Dog(String name) { super(name); }
  public Dog() { super(); }
  public static class Factory
          implements com.zhaofukai.thinkinjava.typeinfo.factory.Factory<Pet> {
    public Pet create() {
      return new Dog();
    }
  }
} ///:~
