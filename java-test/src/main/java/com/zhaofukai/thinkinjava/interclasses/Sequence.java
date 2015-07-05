package com.zhaofukai.thinkinjava.interclasses;//: innerclasses/Sequence.java
// Holds a sequence of Objects.

import com.zhaofukai.thinkinjava.initialzation.ObjectReBirth;
import org.springframework.orm.jpa.vendor.OpenJpaDialect;

interface Selector {
    boolean end();

    Object current();

    void next();
}

public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length) i++;
        }

        public Sequence getSeqence() {
            return Sequence.this;
        }
    }

    private class SequenceReverseSelector implements Selector {
        private int i = items.length - 1;
        public boolean end() {
            return i < 0;
        }
        public Object current() {
            return items[i];
        }
        public void next() {
            if (i >= 0) {
                i--;
            }
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public Selector reverseSelector() {
        return new SequenceReverseSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
        selector = sequence.reverseSelector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
