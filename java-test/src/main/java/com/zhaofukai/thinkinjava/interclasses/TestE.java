package com.zhaofukai.thinkinjava.interclasses;

/**
 * @author: by zhaofukai
 */
public class TestE {
    private String name;
    private void myName() {
        System.out.println(name);
    }
    class Inner {
        private int age;
        public void alterName(String str) {
            name = str;
            myName();
        }
    }
    public Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Inner inner = new TestE().getInner();
        inner.alterName("ok");
    }
}
