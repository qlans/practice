package com.zhaofukai.thinkinjava.interfaces;

/**
 * Created by zhao on 2015/6/22.
 */
public abstract class TestA {
    public TestA() {
        System.out.println("init TestA begin");
        print();
        System.out.println("init TestA end");
    }
    public abstract void print();

    public static void main(String[] args) {
        TestAImpl testA = new TestAImpl();
        testA.print();
    }
}

class TestAImpl extends TestA {
    private int i = 10;
    public void print() {
        System.out.println("TestAImpl: " + i);
    }
}