package com.zhaofukai.thinkinjava.polymorphism.music;

import static com.zhaofukai.thinkinjava.net.util.Print.print;

/**
 * Created by zhao on 2015/6/21.
 */
public class CycleManage {
    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        unicycle.ride();
        bicycle.ride();
        tricycle.ride();
    }
}


class Cycle {
    public void ride() {
        print("base ride" + wheels());
    }
    public int wheels() {return 0;}
}

class Unicycle extends Cycle {}

class Bicycle extends Cycle {}

class Tricycle extends Cycle {}