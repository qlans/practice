package com.zhaofukai.thinkinjava.generics;//: generics/ExplicitTypeSpecification.java

import com.zhaofukai.thinkinjava.net.util.New;
import com.zhaofukai.thinkinjava.typeinfo.pets.Person;
import com.zhaofukai.thinkinjava.typeinfo.pets.Pet;

import java.util.List;
import java.util.Map;

public class ExplicitTypeSpecification {
    static void f(Map<Person, List<Pet>> petPeople) {
    }

    public static void main(String[] args) {
        f(New.<Person, List<Pet>>map());
    }
} ///:~
