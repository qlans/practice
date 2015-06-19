package com.zhaofukai.thinkinjava.resuing;

import static com.zhaofukai.thinkinjava.net.util.Print.print;

/**
 * @author: by zhaofukai
 */
public class CTest extends ATest{
    BTest bTest = new BTest(9);
    public CTest(int i) {
        super(i);
        print("CTest" + i);
    }
    public static void main(String[] args) {
        CTest cTest = new CTest(10);
    }
}

class ATest{
    public ATest(int i) {
        print("ATest" + i);
    }
}

class BTest{
    public BTest(int i) {
        print("BTest" + i);
    }
}
