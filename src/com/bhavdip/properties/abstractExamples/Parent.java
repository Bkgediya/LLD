package com.bhavdip.properties.abstractExamples;

abstract public class Parent {

    static int montly_expense = 100000;
    final int expense;

    Parent () {
        this.expense = 20000;
    }

    static void hello  ()  {
        System.out.println("Hello from parent");
    }

    // this you must have to override
    abstract void career (String name);
    abstract void partner(String name, int age);

    void normalMethod () {
        System.out.println("Hello from normal methods");
    }
}
