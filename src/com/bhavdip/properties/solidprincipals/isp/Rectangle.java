package com.bhavdip.properties.solidprincipals.isp;

public class Rectangle implements TwoDimension{
    private  double width,length;
    public Rectangle(double w, double l) {
        this.length =l;
        this.width = w;
    }
    @Override
    public double area() {
        return length * width;
    }
}
