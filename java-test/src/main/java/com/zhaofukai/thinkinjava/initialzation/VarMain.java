package com.zhaofukai.thinkinjava.initialzation;

import java.util.Arrays;

/**
 * @author: by zhaofukai
 */
public class VarMain {
    public static void main(String[] args) {
        OtherMain.main("a", "b", "c");
        OtherMain.main(new String[]{"d", "e", "f"});
        String[] str = {"h", "i", "j"};
        OtherMain.main(str);
    }
}

class OtherMain {
    public static void main(String... args) {
        System.out.println(Arrays.toString(args));
    }
//    public static void main(String[] args) {
//        System.out.println(Arrays.toString(args));
//    }
}