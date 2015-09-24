package com.zhaofukai.thinkinjava.generics;//: generics/BasicGeneratorDemo.java

import com.zhaofukai.thinkinjava.net.util.BasicGenerator;
import com.zhaofukai.thinkinjava.net.util.Generator;

public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> gen = new BasicGenerator<CountedObject>(CountedObject.class);
//        Generator<CountedObject> gen =
//                BasicGenerator.create(CountedObject.class);
        for (int i = 0; i < 5; i++)
            System.out.println(gen.next());
    }
} /* Output:
CountedObject 0
CountedObject 1
CountedObject 2
CountedObject 3
CountedObject 4
*///:~
