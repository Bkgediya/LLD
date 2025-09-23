package com.bhavdip.properties.inheritance;

public class Box {
    double l;
    double h;
    double w;

    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // old box
    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    //cube
    Box(double side){
        this.h = side;
        this.l = side;
        this.w = side;
    }

    public Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    public void information () {
        System.out.println("Running the box : === ");
    }
}
