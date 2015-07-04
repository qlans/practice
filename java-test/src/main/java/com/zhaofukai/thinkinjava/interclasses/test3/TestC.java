package com.zhaofukai.thinkinjava.interclasses.test3;

import com.zhaofukai.thinkinjava.interclasses.test1.TestA;
import com.zhaofukai.thinkinjava.interclasses.test2.TestB;
import com.zhaofukai.thinkinjava.interclasses.test2.TestD;

/**
 * @author: by zhaofukai
 */
public class TestC extends TestB {

    protected class TestA1 implements TestA {
        public String name() {
            return "TestA1";
        }
    }

//    @Override
//    public TestA getTestAImpl0 () {
//        return new TestAImpl();
//    }

    public TestA getTestA1() {
        return new TestA1();
    }

    public static void main(String[] args) {
        //TestA testA = new TestC().new TestAImpl();
        TestC testC = new TestC();
        System.out.println(testC.getTestA1().name());

        TestD testD = new TestD();
        System.out.println(testD.getTestA().name());
        System.out.println(testD.getTestA1().name());
        TestA testA = testD.getTestA();
        TestAImpl testImpl = testD.getTestA();
        System.out.println(testA.name());
        System.out.println(testImpl.name());
    }
}
