package com.bhavdip.properties.interfaces;

public class Main {

    public static void main(String[] args) {
//        Car car = new Car();
//
//        car.acc();
//        car.start();
//        car.stop();
        Engine powerEngine = new PowerEngine();

        NiceCar car = new NiceCar();
        car.start();
        car.upgradeEngine(powerEngine);
        car.startMusic();
    }
}
