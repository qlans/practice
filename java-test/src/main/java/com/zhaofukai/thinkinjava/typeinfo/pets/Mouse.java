//: typeinfo/pets/Mouse.java
package com.zhaofukai.thinkinjava.typeinfo.pets;

public class Mouse extends Rodent {
    public Mouse(String name) {
        super(name);
    }

    public Mouse() {
        super();
    }
    public static class Factory
            implements com.zhaofukai.thinkinjava.typeinfo.factory.Factory<Pet> {
        public Pet create() {
            return new Mouse();
        }
    }
} ///:~
