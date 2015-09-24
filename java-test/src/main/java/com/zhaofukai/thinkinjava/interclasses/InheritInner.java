package com.zhaofukai.thinkinjava.interclasses;//: innerclasses/InheritInner.java
// Inheriting an inner class.

class WithInner {
    class Inner {
    }
}

public class InheritInner extends WithInner.Inner {
    //! InheritInner() {} // Won't compile
    InheritInner(WithInner wi) {
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
} ///:~

class AInner{
    class Inner {
        public Inner(int i) {
            System.out.println("AInner" + i);
        }
    }
}

class BInner {
    class Inner extends AInner.Inner{
        public Inner(AInner aInner) {
            aInner.super(10);
        }
    }
}