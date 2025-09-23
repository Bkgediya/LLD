package com.bhavdip.properties.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(BoxWeight other) {
        // this is same like Box box = new BoxWeight(10,11,12,30)
        super(other);
        this.weight = other.weight;
    }

    public BoxWeight(Box old, double weight) {
        super(old);
        this.weight = weight;
    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }

    public BoxWeight() {
        this.weight = weight;
    }

    public void normalMethod () {
        System.out.println("hello from box weight");
    }


}
