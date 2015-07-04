package com.zhaofukai.thinkinjava.interfaces;

import java.util.Random;

/**
 * @author: by zhaofukai
 */
public class MyGame {
    public static int getScore(TGameFactory tGameFactory) {
        Random random = new Random(47);
        TGame tGame = tGameFactory.getTGame();
        return random.nextInt(tGame.getRange());
    }

    public static void main(String[] args) {
        System.out.println(getScore(new CoinTGameFactory()));
        System.out.println(getScore(new CoinTGameFactory()));
        System.out.println(getScore(new CoinTGameFactory()));

        System.out.println(getScore(new SiceTGameFactory()));
        System.out.println(getScore(new SiceTGameFactory()));
        System.out.println(getScore(new SiceTGameFactory()));
    }
}

interface TGame {
    int getRange();
}

class CoinTGame implements TGame {
    private static int range = 2;
    public int getRange() {
        return range;
    }
}

class SiceTGame implements TGame {
    private static int range = 6;
    public int getRange() {
        return range;
    }
}

interface TGameFactory {
    TGame getTGame();
}

class CoinTGameFactory implements TGameFactory{
    public TGame getTGame() {
        return new CoinTGame();
    }
}

class SiceTGameFactory implements TGameFactory{
    public TGame getTGame() {
        return new SiceTGame();
    }
}
