package com.zhaofukai.thinkinjava.interclasses;

/**
 * @author: by zhaofukai
 */

interface TestG {
    void name();
}

public class TestF {
    public TestG getTestG() {
        class Inner implements TestG {
            public void name() {
                System.out.println("Inner");
            }
        }
        return new Inner();
    }

    public TestG getTestG1(boolean flag) {
        if (flag) {
            class Inner implements TestG {
                public void name() {
                    System.out.println("Inner");
                }
            }
            return new Inner();
        }
        return null;
    }

    private class TestH implements Contents {
        public int value() {
            return 1;
        }
    }

    public Contents getContents () {
        return new TestH();
    }

    public static void main(String[] args) {
        TestF testF = new TestF();
        testF.getTestG1(true).name();
        //testF.getTestG1(false).name();

        Contents contents = testF.getContents();
        System.out.println(contents.value());
        //System.out.println((TestH)contents.value());
    }
}
