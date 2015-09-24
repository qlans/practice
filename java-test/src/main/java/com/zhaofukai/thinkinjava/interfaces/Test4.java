package com.zhaofukai.thinkinjava.interfaces;

/**
 * Created by zhao on 2015/6/22.
 */
public abstract class Test4 {
    public abstract void name();
    public static void main(String[] args) {
        Test4Impl.covert(new Test4Impl());
    }
}

class Test4Impl extends Test4 {
    public void name() {
        System.out.println("Test4Impl");
    }
    public static Test4Impl covert(Test4 test4) {
        return (Test4Impl) test4;
    }
}