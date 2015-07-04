package com.zhaofukai.thinkinjava.interclasses;

/**
 * @author: by zhaofukai
 */
public class Outer {
    private String value;
    public Outer (String value) {
        this.value = value;
    }
    class Inner {
        @Override
        public String toString() {
            return value;
        }
    }
    public Inner getInner() {
        return new Inner();
    }
    public static void main(String[] args) {
        Outer.Inner inner = new Outer("are you ok").getInner();
        System.out.println(inner);
    }
}
