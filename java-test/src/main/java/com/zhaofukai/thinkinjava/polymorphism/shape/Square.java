//: polymorphism/shape/Square.java
package com.zhaofukai.thinkinjava.polymorphism.shape;

import static com.zhaofukai.thinkinjava.net.util.Print.print;

public class Square extends Shape {
    @Override
    public void draw() {
        print("Square.draw()");
    }

    @Override
    public void erase() {
        print("Square.erase()");
    }
} ///:~
