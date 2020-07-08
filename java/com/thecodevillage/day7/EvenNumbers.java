package com.thecodevillage.day7;

public class EvenNumbers {

    //output numbers between 1 and 100 that are even
    public static void main(String[] args){
        int num=1;
        System.out.println("-- DO WHILE --");
        do {
            if (num%2 == 0){
                System.out.println("Num: "+num);
            }
            num++;
        } while(num <= 100);

        num=1;
        System.out.println("-- WHILE --");
        while(num <= 100){
            if (num%2 == 0){
                System.out.println("Num: "+num);
            }
            num++;
        }

        num=1;
        System.out.println("-- FOR LOOP --");
        for (; num <=100 ; num++){
            if (num%2 == 0){
                System.out.println("Num: "+num);
            }
        }

    }


}
