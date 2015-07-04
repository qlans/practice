package com.zhaofukai.thinkinjava.interfaces;

import static com.zhaofukai.thinkinjava.net.util.Print.print;

/**
 * @author: by zhaofukai
 */
public class Cycles {
    public static void useCycle(CycleFactory cycleFactory) {
        Cycle cycle = cycleFactory.getCycle();
        cycle.move();
    }
    public static void main(String[] args) {
        useCycle(new UnicycleFactory());
        useCycle(new BicycleFactory());
        useCycle(new TricycleFactory());
    }
}

interface Cycle {
    void move();
}

class Unicycle implements Cycle {
    public void move() {
        print("unicycle");
    }
}

class Bicycle implements Cycle {
    public void move() {
        print("bicycle");
    }
}

class Tricycle implements Cycle {
    public void move() {
        print("tricycle");
    }
}

interface CycleFactory {
    Cycle getCycle();
}

class UnicycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class BicycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class TricycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Tricycle();
    }
}

