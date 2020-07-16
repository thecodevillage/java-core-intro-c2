package com.thecodevillage.day12.example2;

public class MyTriangle  extends MyShape{
    double base = 0, height =0;

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}
