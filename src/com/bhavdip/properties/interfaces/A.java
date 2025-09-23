package com.bhavdip.properties.interfaces;

public interface A {
    //static interface should always need body
    // call via the interface name
    static void greeting () {
        System.out.println("hello from static from interface");
    }
}
