package com.zhaofukai.thinkinjava.interfaces.interfaceprocessor;

import com.zhaofukai.thinkinjava.initialzation.ObjectReBirth;

/**
 * Created by zhao on 2015/6/22.
 */
public class SwapString {
    public String name() {
        return this.toString();
    }
    public String process(String str) {
        StringBuilder string = new StringBuilder(str);
        for (int i = 1; i < string.length(); i += 2) {
            char c = string.charAt(i);
            string.setCharAt(i, string.charAt(i - 1));
            string.setCharAt(i - 1, c);
        }
        return string.toString();
    }
    public static void main(String[] args) {
        SwapString swapString = new SwapString();
        String param = "123456";
        System.out.println(swapString.process(param));
        Apply.process(new SwapStringAdapter(swapString), param);
    }
}

class SwapStringAdapter implements Processor {
    SwapString swapString;
    public SwapStringAdapter(SwapString swapString) {
        this.swapString = swapString;
    }
    public String name() {
        return swapString.name();
    }
    public String process(Object input) {
        return swapString.process((String) input);
    }
}