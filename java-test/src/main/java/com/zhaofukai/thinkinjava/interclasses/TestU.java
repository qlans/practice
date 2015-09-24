package com.zhaofukai.thinkinjava.interclasses;

/**
 * Created by zhao on 2015/7/4.
 */
public class TestU {
    public static void main(String[] args) {
        AImpl[] aImpl = new AImpl[10];
        for (int i = 0; i < aImpl.length; i++) {
            aImpl[i] = new AImpl();
        }
        BImpl bImpl = new BImpl();
        for (AImpl item : aImpl) {
            bImpl.setUItem(item.getU());
        }
        bImpl.moveThrough();
        bImpl.setUArrayNull(0);
    }
}

interface U {
    void name();
    void age();
    void ready();
}

class AImpl {
    public U getU() {
        return new U() {
            public void name() {
                System.out.println("AImpl.UImpl.name()");
            }

            public void age() {
                System.out.println("AImpl.UImpl.age()");
            }

            public void ready() {
                System.out.println("AImpl.UImpl.ready()");
            }
        };
    }
}

class BImpl {
    private int i = 0;
    private U[] uArray = new U[10];
    public boolean setUItem (U u) {
        if (i < uArray.length) {
            uArray[i] = u;
            i++;
            return true;
        }
        return false;
    }
    public boolean setUArrayNull(int j) {
        if (j < i && j >= 0) {
            uArray[j] = null;
            return true;
        }
        return false;
    }
    public void moveThrough() {
        for (int j = 0; j < i; j++) {
            uArray[j].name();
            uArray[j].age();
            uArray[j].ready();
        }
    }
}

