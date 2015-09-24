package com.zhaofukai.thinkinjava.interfaces;

import javax.print.DocFlavor;

import static com.zhaofukai.thinkinjava.net.util.Print.print;

/**
 * Created by zhao on 2015/6/22.
 */
public abstract class Rodent {

    private static int count = 0;
    private final int id = count++;

    public Rodent() {
        print("Rodent init");
    }

    public abstract String myName();

    @Override
    public String toString() {
        return myName() + ": " + id;
    }

    public static void main(String[] args) {
        Rodent[] rodents = {
                new Mouse(),
                new Gerbil(),
                new Hamster()
        };
        for (int i = 0; i < rodents.length; i++) {
            System.out.println(rodents[i]);
        }
    }
}

class Mouse extends Rodent {
    public Mouse() {
        print("Mouse init");
    }

    @Override
    public String myName() {
        return "Mouse";
    }
}

class Gerbil extends Rodent {
    public Gerbil() {
        print("gerbil init");
    }

    @Override
    public String myName() {
        return "Gerbil";
    }
}

class Hamster extends Rodent {
    public Hamster() {
        print("Hamster init");
    }

    @Override
    public String myName() {
        return "Hamster";
    }
}
