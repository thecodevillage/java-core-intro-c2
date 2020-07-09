package com.thecodevillage.day8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Area1 {


    //allow user input any 3 numbers (a,b ,c )
    //write a function that return result of a * b and another that returns result of a * b * c
    //output the result
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#.####");
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;

        System.out.println(" Enter a ");
        a = scanner.nextInt();

        System.out.println(" Enter b");
        b = scanner.nextInt();

        System.out.println(" Enter c ");
        c = scanner.nextInt();

        System.out.println("Result 2: "+product(a,b));
        System.out.println("Result 3: "+product(a,b,c));

    }

    static int product(int x,int y){
        return x * y;
    }

    static int product(int x,int y,int z){
        return x * y * z;
    }

    static double product(double x){
        return x;
    }

    static int product(){
        return 0;
    }


}
