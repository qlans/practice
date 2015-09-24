package com.zhaofukai.thinkinjava.initialzation;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.Date;

/**
 * Created by zhao on 2015/6/7.
 */
public class ThreeReferenceDiff {
        public static void main(String[] args) throws Exception {

            ReferenceQueue queue = new ReferenceQueue();
             SoftReference ref = new SoftReference(new B1(), queue);
            // WeakReference ref = new WeakReference(new B1(), queue);
            //PhantomReference ref = new PhantomReference(new B1(), queue);
            while (true) {
                Object obj = queue.poll();
                if (obj != null) {
                    System.out.println("queue.poll at " + new Date() + " " + obj);
                    break;
                }
                System.gc();
                System.out.println("run once.");
            }

            Thread.sleep(100000);
        }
}

class B1 {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize at " + new Date());
    }
}
