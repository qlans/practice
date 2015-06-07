package com.zhaofukai.thinkinjava.initialzation;

import junit.framework.Assert;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 * Enqueue之前，对WeakReference,GC保证它是Finalizable，但是有可能在执行这个对象的finalize方法时对象重生。
 * 所以监视到一个WeakReference对象enqueue并不能保证该对象已经被确定性销毁。
 * Enqueue之前，对PhantomReference,GC保证它是reclaimed，就是说该对象已经被认为要被确定性销毁了，
 * 没有任何机会重生了。所以我们可以在这个点做一些必须保证对象被销毁才适合做的清理工作。
 * Created by zhao on 2015/6/7.
 */
public class PhantomReferenceQueueClear {
    public static void main(String[] args) throws InterruptedException {
        ReferenceQueue queue = new ReferenceQueue();
        PhantomReference ref = new PhantomReference(new A1(), queue);
        Assert.assertNull(ref.get());

        Object obj = null;
        obj = queue.poll();
        Assert.assertNull(obj);
        System.gc();
        Thread.sleep(10000);
        System.gc();
        Assert.assertNull(ref.get());
        obj = queue.poll();
        Assert.assertNotNull(obj);
    }
}
