package com.zhaofukai.thinkinjava.typeinfo.pets;

/**
 * Created by zhao on 2015/7/12.
 */
public class Gerbil extends Rodent{
    public Gerbil() {
        super();
    }
    public Gerbil(String name) {
        super(name);
    }
    public static class Factory
            implements com.zhaofukai.thinkinjava.typeinfo.factory.Factory<Pet> {
        public Pet create() {
            return new Gerbil();
        }
    }
}
