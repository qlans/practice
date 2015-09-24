package com.zhaofukai.thinkinjava.initialzation;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import junit.framework.Assert;

/**
 * 在GC运行时，检测到new A()生成的对象只有一个WeakReference引用着，所以决定回收它，
 * 首先clear WeakReference的ref，然后ref的状态为finalizable，
 * 同时或者一段时间后把WeakReference放入监听的ReferenceQueue中。
 * 最后的Assert.assertNotNull(obj);有时会失败，因为还没有来的及把WeakReference放入监听的ReferenceQueue中
 * Created by zhao on 2015/6/7.
 */
public class WeakReferenceQueueClear {
    public static void main(String[] args) throws InterruptedException {
        ReferenceQueue queue = new ReferenceQueue();
        WeakReference ref  = new WeakReference(new A1(), queue);
        System.out.println("queue1: " + queue);
        Assert.assertNotNull(ref.get());

        Object object = null;
        object = queue.poll();
        System.out.println("queue2: " + queue);
        Assert.assertNull(object);

        System.gc();

        Assert.assertNull(ref.get());
        System.out.println("queue3: " + queue);
        Thread.sleep(3000);
        System.out.println("queue4: " + queue);
        object = queue.poll();
        Assert.assertNotNull(object);
    }
}

class A1 {
    @Override
    public void finalize() {
        System.out.println("A1 finalize");
    }
}