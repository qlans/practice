package com.zhaofukai.thinkinjava.initialzation;

import java.util.Arrays;

/**
 * @author: by zhaofukai
 */
public class VarString {
    public static void main(String[] args) {
        new mVarString("a", "b");
        new mVarString(new String[]{"c", "d"});
    }
}

class mVarString {
    String[] str;
    mVarString (String... args) {
        System.out.println(Arrays.toString(args));
        str = args;
    }
}