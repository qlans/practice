package com.zhaofukai.thinkinjava.initialzation;

/**
 * @author: by zhaofukai
 */
public class ArrayInitialization {
    public static void main(String[] args) {
        StringObject[] sObject = new StringObject[10];
        for (int i = 0; i < 10; i++) {
            sObject[i] = new StringObject(String.valueOf(i));
        }
    }
}

class StringObject {
    private String s;
    StringObject (String s) {
        System.out.println("s: " + s);
        this.s = s;
    }
}