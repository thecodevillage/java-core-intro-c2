package com.thecodevillage.day7;

import java.util.ArrayList;
import java.util.List;

public class LoopsIntro {

    //write a loop to output 1 - 100

    public static void main(String[] args){
        int num=1;

        System.out.println(" -- WHILE LOOP ---");
        while(num<=10){
            System.out.println("Num: "+num);
            num++;
        }

        // do while
        System.out.println(" --DO WHILE ---");
        num=1;
        do {
            System.out.println("Num: "+num);
            num++;
        } while(num <=10);

        System.out.println("-- FOR LOOP --");
        //for loop
        for (num=1; num <= 10; num++){
            System.out.println("Num: "+num);
        }

//        List<Integer> integers=new ArrayList<>();
//        integers.add(1);
//        System.out.println(" FOREACH ");
//        for (int numm: integers) {
//            System.out.println(numm);
//        }

//        for(int i=0; i <=integers.size(); i++){
//            System.out.println("Num: "+num);
//        }

    }






}
