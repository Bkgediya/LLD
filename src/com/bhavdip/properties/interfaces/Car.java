package com.bhavdip.properties.interfaces;

public class Car implements Engine, Break{

    @Override
    public void start() {
        System.out.println("I start like normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like normal car");
    }

    @Override
    public void acc() {
        System.out.println("I acc like normal car");
    }

    @Override
    public void breake() {
        System.out.println("I am break like normal car");
    }
}
