//: typeinfo/pets/ForNameCreator.java
package com.zhaofukai.thinkinjava.typeinfo.pets;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types =
            new ArrayList<Class<? extends Pet>>();
    // Types that you want to be randomly created:
    private static String[] typeNames = {
            "com.zhaofukai.thinkinjava.typeinfo.pets.Mutt",
            "com.zhaofukai.thinkinjava.typeinfo.pets.Pug",
            "com.zhaofukai.thinkinjava.typeinfo.pets.EgyptianMau",
            "com.zhaofukai.thinkinjava.typeinfo.pets.Manx",
            "com.zhaofukai.thinkinjava.typeinfo.pets.Cymric",
            "com.zhaofukai.thinkinjava.typeinfo.pets.Rat",
            "com.zhaofukai.thinkinjava.typeinfo.pets.Mouse",
            "com.zhaofukai.thinkinjava.typeinfo.pets.Hamster",
            "com.zhaofukai.thinkinjava.typeinfo.pets.Gerbil"
    };

    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for (String name : typeNames)
                types.add(
                        (Class<? extends Pet>) Class.forName(name));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static {
        loader();
    }

    public List<Class<? extends Pet>> types() {
        return types;
    }

    public static void main(String[] args) {
        System.out.println(types);
    }
} ///:~
