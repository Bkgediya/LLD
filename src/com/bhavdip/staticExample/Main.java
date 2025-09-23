package com.bhavdip.staticExample;

public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(20,"kunal",10000,true);
        Human mahesh = new Human(25,"mahesh",12000,true);
        System.out.println(kunal.name);

        Singleton obj = Singleton.getSingleton();
        Singleton obj2 = Singleton.getSingleton();
        Singleton obj3 = Singleton.getSingleton();
    }
}
