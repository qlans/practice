//: typeinfo/pets/Cat.java
package com.zhaofukai.thinkinjava.typeinfo.pets;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super();
    }

    public static class Factory
            implements com.zhaofukai.thinkinjava.typeinfo.factory.Factory<Pet> {
        public Pet create() {
            return new Cat();
        }
    }
} ///:~
