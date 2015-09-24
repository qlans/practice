package com.zhaofukai.thinkinjava.concurrency;

/**
 * @author: by zhaofukai
 */
public class MainThread {
    public static void main(String[] args) {
        LiftOff lauch = new LiftOff();
        lauch.run();
    }
}
