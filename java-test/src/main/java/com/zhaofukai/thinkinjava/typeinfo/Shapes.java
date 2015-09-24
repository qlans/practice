package com.zhaofukai.thinkinjava.typeinfo;//: typeinfo/Shapes.java

import java.util.Arrays;
import java.util.List;

abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    void rotate() {

    }

    abstract public String toString();
}

class Circle extends Shape {
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    public String toString() {
        return "Triangle";
    }
}

class Rhomboid extends Shape {
    public String toString() {
        return "Rhomboid";
    }
}

public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle()
        );
        Shape shapeImpl = new Rhomboid();
        if (shapeImpl instanceof  Rhomboid) {
            System.out.println("convert to Rhomboid");
            Rhomboid rhomboid = (Rhomboid) shapeImpl;
        } else if (shapeImpl instanceof Circle) {
            System.out.println("convert to Circle");
            Circle circle = (Circle) shapeImpl;
        }
        for (Shape shape : shapeList)
            shape.draw();
    }
} /* Output:
Circle.draw()
Square.draw()
Triangle.draw()
*///:~
