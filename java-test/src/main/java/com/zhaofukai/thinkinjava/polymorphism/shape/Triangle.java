//: polymorphism/shape/Triangle.java
package com.zhaofukai.thinkinjava.polymorphism.shape;

import static com.zhaofukai.thinkinjava.net.util.Print.print;

public class Triangle extends Shape {
    @Override
    public void draw() {
        print("Triangle.draw()");
    }

    @Override
    public void erase() {
        print("Triangle.erase()");
    }
} ///:~
