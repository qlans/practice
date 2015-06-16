package com.zhaofukai.thinkinjava.initialzation;

import java.util.ConcurrentModificationException;

/**
 * @author: by zhaofukai
 */
enum Coin {
    ONE (1),
    TWO (2),
    FIVE (5),
    TEN (10),
    FIFTY (50),
    HUNDRED (100);

    int demo;
    Coin (int demo) {
        this.demo = demo;
    }

    public void value(Coin coin) {
        switch (coin) {
            case ONE :
            case TWO :
            case FIVE:
                System.out.println("little value");
                break;
            case TEN:
            case FIFTY:
                System.out.println("big value");
                break;
            case HUNDRED:
                System.out.println("biggest value");
                break;
        }
    }
}

public class CoinEnumTest {
    public static void main(String[] args) {
        for (Coin coin : Coin.values()) {
            System.out.println(coin + ", oridnal: " + coin.ordinal());
            coin.value(coin);
        }
    }
}