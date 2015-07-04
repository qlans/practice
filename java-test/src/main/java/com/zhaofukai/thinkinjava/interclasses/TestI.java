package com.zhaofukai.thinkinjava.interclasses;

/**
 * @author: by zhaofukai
 */
public class TestI {
    public TestJ getTestJ(int v) {
        return new TestJ(v) {
            public int getValue() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        TestI testI = new TestI();
        TestJ testJ = testI.getTestJ(100);
        //System.out.println(testJ);
    }
}

class TestJ {
    protected int i;
    public TestJ(int i) {
        this.i = i;
        System.out.println("TestJ " + i);
    }
}
