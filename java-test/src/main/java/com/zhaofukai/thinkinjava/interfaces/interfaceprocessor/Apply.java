//: interfaces/interfaceprocessor/Apply.java
package com.zhaofukai.thinkinjava.interfaces.interfaceprocessor;

import static com.zhaofukai.thinkinjava.net.util.Print.print;

public class Apply {
    public static void process(Processor p, Object s) {
        print("Using Processor " + p.name());
        print(p.process(s));
    }
} ///:~
