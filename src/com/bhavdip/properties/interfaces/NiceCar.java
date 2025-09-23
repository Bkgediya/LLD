package com.bhavdip.properties.interfaces;

public class NiceCar {

    private Engine engine;
    private final Media cdPlayer = new CDPlayer();

    NiceCar () {
        this.engine = new PowerEngine();
    }

    NiceCar(Engine engine) {
        this.engine = engine;
    }

    public  void start() {
        engine.start();
    }

    public  void startMusic () {
        cdPlayer.start();
    }

    public  void upgradeEngine (Engine engine) {
        this.engine = engine;
    }

}
