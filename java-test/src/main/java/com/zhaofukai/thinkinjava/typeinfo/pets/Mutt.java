//: typeinfo/pets/Mutt.java
package com.zhaofukai.thinkinjava.typeinfo.pets;

public class Mutt extends Dog {
    public Mutt(String name) {
        super(name);
    }

    public Mutt() {
        super();
    }
    public static class Factory
            implements com.zhaofukai.thinkinjava.typeinfo.factory.Factory<Pet> {
        public Pet create() {
            return new Mutt();
        }
    }
} ///:~
