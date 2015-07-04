package com.zhaofukai.thinkinjava.interclasses.test2;

import com.zhaofukai.thinkinjava.interclasses.test1.TestA;
import com.zhaofukai.thinkinjava.interclasses.test3.TestC;

/**
 * @author: by zhaofukai
 */
public class TestD extends TestB{
    protected class TestA1 implements TestA {
        public String name() {
            return "TestA1";
        }
    }

    public TestAImpl getTestA() {
        return new TestAImpl();
    }

    public TestA getTestA1() {
        return new TestA1();
    }

    public static void main(String[] args) {
        TestD testD = new TestD();
        System.out.println(testD.getTestA1().name());
        System.out.println(testD.getTestA().name());
    }
}
