package com.zhaofukai.thinkinjava.generics;//: generics/SimplerPets.java

import com.zhaofukai.thinkinjava.net.util.New;
import com.zhaofukai.thinkinjava.typeinfo.pets.Person;
import com.zhaofukai.thinkinjava.typeinfo.pets.Pet;

import java.util.List;
import java.util.Map;

public class SimplerPets {
    public static void main(String[] args) {
        Map<Person, List<? extends Pet>> petPeople = New.map();
        // Rest of the code is the same...
    }
} ///:~
