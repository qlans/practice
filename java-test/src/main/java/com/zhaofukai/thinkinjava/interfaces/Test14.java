package com.zhaofukai.thinkinjava.interfaces;

/**
 * @author: by zhaofukai
 */
public class Test14 extends Test145 implements Test144 {
    public void name() {}
    public void age() {}
    public void hight() {}

    public static void f1(Test141 test141) {}
    public static void f2(Test141 test142) {}
    public static void f3(Test141 test143) {}
    public static void f4(Test141 test144) {}

    public static void main(String[] args) {
        Test14 test14 = new Test14();
        f1(test14);
        f2(test14);
        f3(test14);
        f4(test14);
    }
}

interface Test141 {
    void name();
    void age();
}
interface Test142 {
    void name();
    void age();
}
interface Test143 {
    void name();
    void age();
}

interface Test144 extends Test141, Test142, Test143 {
    void hight();
}

class Test145 {

}