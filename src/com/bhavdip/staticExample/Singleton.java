package com.bhavdip.staticExample;

public class Singleton {
    private Singleton () {
    }

    private static Singleton instance;

    public static Singleton getSingleton() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

}
