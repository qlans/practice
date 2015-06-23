package com.zhaofukai.thinkinjava.resuing;

import static com.zhaofukai.thinkinjava.net.util.Print.print;

/**
 * Created by zhao on 2015/6/20.
 */
public class FirstBeetle extends Beetle {
    private int k = printInit("FBeetle.k initialized");

    public FirstBeetle() {
        print("k = " + k);
        print("j = " + j);
    }

    private static int x2 =
            printInit("static FBeetle.x2 initialized");

    public static void main(String[] args) {
        print("FBeetle constructor");
        Beetle b = new FirstBeetle();
        Beetle c = new FirstBeetle();
    }
}
