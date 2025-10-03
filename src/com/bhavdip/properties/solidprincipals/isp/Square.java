package com.bhavdip.properties.solidprincipals.isp;

public class Square implements TwoDimension{
    private double side;

    public Square(double side) {
        this.side = side;

    }
    @Override
    public double area() {
        return side * side;
    }
}
