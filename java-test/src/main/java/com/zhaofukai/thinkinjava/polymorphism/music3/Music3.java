//: polymorphism/music3/Music3.java
// An extensible program.
package com.zhaofukai.thinkinjava.polymorphism.music3;

import com.zhaofukai.thinkinjava.polymorphism.music.Note;

import java.util.Random;

import static com.zhaofukai.thinkinjava.net.util.Print.print;

class Instrument {
    void play(Note n) {
        print("Instrument.play() " + n);
    }

    String what() {
        return "Instrument";
    }

    void adjust() {
        print("Adjusting Instrument");
    }

    @Override
    public String toString() {
        return what();
    }
}

class Wind extends Instrument {
    void play(Note n) {
        print("Wind.play() " + n);
    }

    String what() {
        return "Wind";
    }

    void adjust() {
        print("Adjusting Wind");
    }
}

class Percussion extends Instrument {
    void play(Note n) {
        print("Percussion.play() " + n);
    }

    String what() {
        return "Percussion";
    }

    void adjust() {
        print("Adjusting Percussion");
    }
}

class Stringed extends Instrument {
    void play(Note n) {
        print("Stringed.play() " + n);
    }

    String what() {
        return "Stringed";
    }

    void adjust() {
        print("Adjusting Stringed");
    }
}

class MyInstrument extends Instrument {
    void play (Note n) {
        print("MyInstrument.play() " + n);
    }
    String what () {
        return "MyInstrument";
    }
    void adjust () {
        print("Adjusting MyInstrument");
    }
}

class Brass extends Wind {
    void play(Note n) {
        print("Brass.play() " + n);
    }

    void adjust() {
        print("Adjusting Brass");
    }
}

class Woodwind extends Wind {
    void play(Note n) {
        print("Woodwind.play() " + n);
    }

    String what() {
        return "Woodwind";
    }
}

public class Music3 {
    // Doesn't care about type, so new types
    // added to the system still work right:
    public static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
        System.out.println(i);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e)
            tune(i);
    }

    static Random random = new Random(47);

    public static Instrument next() {
        switch (random.nextInt(6)) {
            default:
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Stringed();
            case 3: return new Brass();
            case 4: return new Woodwind();
            case 5: return new MyInstrument();
        }
    }

    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
                new MyInstrument(),
        };
        tuneAll(orchestra);
        for (int i = 0; i < 5; i++) {
            tune(next());
        }
    }
} /* Output:
Wind.play() MIDDLE_C
Percussion.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
Woodwind.play() MIDDLE_C
*///:~
