package com.bhavdip.properties.abstractExamples;

public class Son extends Parent {

    @Override
    void career(String name) {
        System.out.println("Hello I want to be a " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("This is "+ name + "And age is "+ age);
    }
}
