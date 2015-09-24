package com.zhaofukai.thinkinjava.holding;//: holding/PetMap.java

import com.zhaofukai.thinkinjava.typeinfo.pets.Cat;
import com.zhaofukai.thinkinjava.typeinfo.pets.Dog;
import com.zhaofukai.thinkinjava.typeinfo.pets.Hamster;
import com.zhaofukai.thinkinjava.typeinfo.pets.Pet;

import java.util.HashMap;
import java.util.Map;

import static com.zhaofukai.thinkinjava.net.util.Print.print;

public class PetMap {
    public static void main(String[] args) {
        Map<String, Pet> petMap = new HashMap<String, Pet>();
        petMap.put("My Cat", new Cat("Molly"));
        petMap.put("My Dog", new Dog("Ginger"));
        petMap.put("My Hamster", new Hamster("Bosco"));
        print(petMap);
        Pet dog = petMap.get("My Dog");
        print(dog);
        print(petMap.containsKey("My Dog"));
        print(petMap.containsValue(dog));
    }
} /* Output:
{My Cat=Cat Molly, My Hamster=Hamster Bosco, My Dog=Dog Ginger}
Dog Ginger
true
true
*///:~
