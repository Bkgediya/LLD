package com.bhavdip.staticExample;

public class StaticBlock {
    static int a = 1;
    static int b;

    // only call first time when first time class object is created //
    static {
        System.out.println("hello from static block");
        b = a * 5;
    }


    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a);
        System.out.println(StaticBlock.b);

        StaticBlock.b += 3;
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a);
        System.out.println(StaticBlock.b);

    }
}
