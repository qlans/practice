package com.zhaofukai.thinkinjava.interfaces;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * @author: by zhaofukai
 */
public class AdaptedRandomDoublesOwn implements Readable{
    RandomDoubles randomDoubles;
    private int count = 10;
    public AdaptedRandomDoublesOwn(RandomDoubles randomDoubles) {
        this.randomDoubles = randomDoubles;
    }

    public int read(CharBuffer cb) throws IOException {
        if (count-- <= 0) {
            return -1;
        }
        String val = String.valueOf(randomDoubles.next() + " ");
        //System.out.println("read: " + val);
        cb.append(val);
        return val.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new AdaptedRandomDoublesOwn(new RandomDoubles()));
        while (scanner.hasNextDouble()) {
            System.out.println(scanner.nextDouble());
        }
    }
}
