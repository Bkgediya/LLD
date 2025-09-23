package com.bhavdip.properties.inheritance;

public class BoxPrice  extends  BoxWeight{
    double price;

    public BoxPrice(double price) {
//        super();
        this.price = price;
    }

    public BoxPrice(double weight, double price) {
        super(weight);
        this.price = price;
    }

    public BoxPrice(BoxWeight other, double price) {
        super(other);
        this.price = price;
    }

    public BoxPrice(Box old, double weight, double price) {
        super(old, weight);
        this.price = price;
    }

    public BoxPrice(double side, double weight, double price) {
        super(side, weight);
        this.price = price;
    }

    public BoxPrice(double l, double h, double w, double weight, double price) {
        super(l, h, w, weight);
        this.price = price;
    }
}
