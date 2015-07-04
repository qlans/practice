package com.zhaofukai.thinkinjava.interclasses;

import java.util.Random;

/**
 * @author: by zhaofukai
 */
public class MyString {
    private String value;
    public MyString(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return value;
    }
    public static void main(String[] args) {
        Random random = new Random(47);
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(new MyString(String.valueOf(random.nextInt())));
        }
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
    }
}
