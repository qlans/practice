package com.zhaofukai.thinkinjava.generics;

import java.util.Iterator;

/**
 * @author: by zhaofukai
 */
public class CombFibonacci extends Fibonacci {
    int count;
    public CombFibonacci(int count) {
        this.count = count;
    }
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() {
                return count > 0;
            }

            public Integer next() {
                count--;
                return CombFibonacci.this.next();
            }

            public void remove() {

            }
        };
    }
    public class CombIterable implements Iterable<Integer> {
        public Iterator<Integer> iterator() {
            return CombFibonacci.this.iterator();
        }
    }

    public static void main(String[] args) {
        CombFibonacci fi = new CombFibonacci(18);
//        Iterator<Integer> i = fi.iterator();
//        while(i.hasNext()) {
//            System.out.println(i.next());
//        }
        for (int j : fi.new CombIterable()) {
            System.out.println("j = " + j);
        }
    }
}
