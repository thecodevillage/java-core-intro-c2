package com.thecodevillage.day12.example2;


public class MyAreaApp {

    public static void main(String[] args){
        MyTriangle myTriangle=new MyTriangle();
        myTriangle.base = 20;
        myTriangle.height = 50;

        double area=myTriangle.calculateArea();

        System.out.println("Area T:"+area);

    }
}
