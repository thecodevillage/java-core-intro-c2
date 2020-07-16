package com.thecodevillage.day12.example2;

public class MyRectangle extends MyShape {

    double l, w;

    @Override
    double calculateArea() {
        return l * w;
    }
}
