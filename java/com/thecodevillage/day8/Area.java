package com.thecodevillage.day8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Area {

    static final double PI = 3.142;

    //calculate area of a circle
    //PI (3.142) * r * r
    //allow a user input the radius
    //write a function that return the area of the circle
    //output the area
    //function to do circumference
    //output the circum

    public static void main(String[] args){
        DecimalFormat decimalFormat=new DecimalFormat("#.####");
        Scanner scanner=new Scanner(System.in);
        double radius = 0;

        System.out.println(" Enter the radius ");
        radius = scanner.nextDouble();

        System.out.println("Area: "+ decimalFormat.format(getAreaCircle(radius)));
        System.out.println("Circumference: "+decimalFormat.format(getCirc(radius)));
    }
    static double getAreaCircle(double radius){
        return PI * radius *radius;
    }



    static double getCirc(double radius){
        return 2 * PI * radius;
    }


}
