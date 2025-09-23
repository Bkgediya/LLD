package com.bhavdip.properties.polymophism;
// types of polymorphism
// compile time -> static polymorphism -> achieve by method overloading
// dynamic -> run time polymorphism -> overriding
public class Main {
    public static void main(String[] args) {

        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        shapes.area();
        circle.area();

    }
}
