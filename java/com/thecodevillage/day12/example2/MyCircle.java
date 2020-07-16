package com.thecodevillage.day12.example2;

public class MyCircle extends MyShape {
    double radius;
    final double PI=3.142;

    @Override
    double calculateArea() {
        return PI*radius*radius;
    }

    public MyCircle() {
    }

    public MyCircle(double radius) {
        this.radius = radius;
    }
}
