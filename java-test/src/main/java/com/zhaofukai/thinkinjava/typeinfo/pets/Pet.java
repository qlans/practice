//: typeinfo/pets/Pet.java
package com.zhaofukai.thinkinjava.typeinfo.pets;

public class Pet extends Individual {
    public Pet(String name) {
        super(name);
    }

    public Pet() {
        super();
    }
    public static class Factory
            implements com.zhaofukai.thinkinjava.typeinfo.factory.Factory<Pet> {
        public Pet create() {
            return new Pet();
        }
    }
} ///:~
