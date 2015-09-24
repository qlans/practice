package com.zhaofukai.thinkinjava.concurrency;

/**
 * @author: by zhaofukai
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff");
    }
}
