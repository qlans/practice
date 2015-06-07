package com.zhaofukai.thinkinjava.initialzation;

/**
 * Created by zhao on 2015/6/7.
 */
public class TerminationCondition {
    public static void main(String[] args) {
        System.gc();
        Book novel = new Book(true);
        novel.checkIn();
        new Book(true);
    }
}

class Book {
    boolean checkedOut = false;
    Book(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }
    void checkIn() {
        checkedOut = false;
    }
    protected void finalize() {
        if (checkedOut) {
            System.out.println("Error: checked out");
        }
    }
}