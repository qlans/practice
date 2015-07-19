package com.zhaofukai.thinkinjava.generics;//: generics/ReturnGenericType.java

class ReturnGenericType<T extends HasF> {
    private T obj;

    public ReturnGenericType(T x) {
        obj = x;
    }

    public T get() {
        return obj;
    }
} ///:~
