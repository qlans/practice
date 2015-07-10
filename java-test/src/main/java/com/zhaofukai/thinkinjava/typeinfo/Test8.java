package com.zhaofukai.thinkinjava.typeinfo;

import com.zhaofukai.thinkinjava.interclasses.Parcel1;
import com.zhaofukai.thinkinjava.typeinfo.toys.ToyTest;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: by zhaofukai
 */
public class Test8 {
    public static void main(String[] args) {
        Test8 test8 = new Test8();
        test8.printAllClass(new char[1].getClass());
    }

    public void printAllClass(Class c) {
//        for (Class cc : c.getInterfaces()) {
//            printAllClass(cc);
//            System.out.println("name: " + cc.getSimpleName());
//        }
        if (c == null) {
            return ;
        }
        printAllClass(c.getSuperclass());
        System.out.println("className: " + c.getSimpleName());
        for (Field field : c.getDeclaredFields()) {
            System.out.println("field = " + field);
        }
    }
}
