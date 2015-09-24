package com.zhaofukai.thinkinjava.polymorphism;

/**
 * Created by zhao on 2015/6/22.
 */
public class TestAB extends BaseAB {
    @Override
    public String B() {
        return "TestAB.B()";
    }

    public static void main(String[] args) {
        BaseAB baseAB = new TestAB();
        baseAB.A();
    }
}

class BaseAB {
    public void A() {
        System.out.println(B());
    }

    public String B() {
        return "BaseAB.B()";
    }
}