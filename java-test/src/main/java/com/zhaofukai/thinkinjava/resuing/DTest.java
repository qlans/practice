package com.zhaofukai.thinkinjava.resuing;

import static com.zhaofukai.thinkinjava.net.util.Print.print;

/**
 * @author: by zhaofukai
 */
public class DTest extends ETest{
    public DTest() {
        super(10);
    }
    public DTest(int i) {
        super(i);
        print("DTest" + i);
    }
    public static void main(String[] args) {
        DTest dTest = new DTest();
        DTest dTest1 = new DTest(11);
    }
}

class ETest{
    public ETest(int i) {
        print("ETest" + i);
    }
}
