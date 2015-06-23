package com.zhaofukai.thinkinjava.interfaces;

import com.zhaofukai.thinkinjava.interfaces.test.MyInterface;

import static com.zhaofukai.thinkinjava.net.util.Print.print;

/**
 * Created by zhao on 2015/6/22.
 */
public class Test5 implements MyInterface {
    public void name() {
        print("test5");
    }
    public void age() {
        print("11");
    }
    public void hight() {
        print(180);
    }
    public static void main(String[] args) {
        Test5 test5 = new Test5();
        test5.name();
        test5.age();
        test5.hight();
    }
}
