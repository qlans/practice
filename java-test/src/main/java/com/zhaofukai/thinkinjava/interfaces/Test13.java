package com.zhaofukai.thinkinjava.interfaces;

/**
 * @author: by zhaofukai
 */

interface TestInterface0 {}

interface TestInterface1 extends TestInterface0 {}

interface TestInterface2 extends TestInterface0 {}

interface TestInterface3 extends TestInterface1, TestInterface2 {}

public class Test13 implements TestInterface3{
}
