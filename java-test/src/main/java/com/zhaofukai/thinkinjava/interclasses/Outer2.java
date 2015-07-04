package com.zhaofukai.thinkinjava.interclasses;

/**
 * @author: by zhaofukai
 */
public class Outer2 {
    public static void main(String[] args) {
        Outer outer = new Outer("123");
        Outer.Inner inner = outer.getInner();
        inner = outer.new Inner();
    }
}
