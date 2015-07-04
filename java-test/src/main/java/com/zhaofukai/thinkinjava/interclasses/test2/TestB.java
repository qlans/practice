package com.zhaofukai.thinkinjava.interclasses.test2;

import com.zhaofukai.thinkinjava.interclasses.test1.TestA;

/**
 * @author: by zhaofukai
 */
public class TestB {
    protected class TestAImpl implements TestA {
        public String name() {
            return "TestAImpl";
        }
    }

    public TestA getTestAImpl0 () {
        return new TestAImpl();
    }
}
