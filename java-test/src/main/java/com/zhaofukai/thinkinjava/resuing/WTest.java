package com.zhaofukai.thinkinjava.resuing;

import com.zhaofukai.thinkinjava.resuing.protect.QTest;

/**
 * @author: by zhaofukai
 */
public class WTest {
    public static void main(String[] args) {
        QTest qTest = new QTest();
        //qTest.test();
        TTest.main(args);
    }
}

class TTest extends QTest {
    public static void main(String[] args) {
        TTest tTest = new TTest();
        tTest.test();
    }
}