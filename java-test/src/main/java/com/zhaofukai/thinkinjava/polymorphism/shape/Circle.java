//: polymorphism/shape/Circle.java
package com.zhaofukai.thinkinjava.polymorphism.shape;

import static com.zhaofukai.thinkinjava.net.util.Print.print;

public class Circle extends Shape {
    @Override
    public void draw() {
        print("Circle.draw()");
    }

    @Override
    public void erase() {
        print("Circle.erase()");
    }

    @Override
    public void printInfo() {
        print("circle");
    }
} ///:~
