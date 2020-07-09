package com.thecodevillage.day8;

import java.util.Scanner;

public class StudentGrade {



    //break
    //continue
    //alternative if
    /*
        1
        2
        3 continue
        4
        5
     */
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
//        int num=1;
        int num=100;

        while(num >0 && num <= 100){
            if (num == 50) {
                num--;
                break;
            }
            System.out.println("Num: "+num);
            num--;
        }

//        with continue statement

        while(num >0 && num <= 100){
            if (num==50){
                num--;
                continue;
            }
            System.out.println("Num: "+num);
            num--;
        }


//        for(int num=0;num <=100 ; num++){
//            if (num==50){
//                continue;
//            }
//
//            System.out.println(num);
//        }


//        for(int num=0;num <=100 ; num++){
//            if (num==50){
//                break;
//            }
//
//            System.out.println(num);
//        }

        /*

        int num = 1;

        while(num <=100){
            if (num==50){
                continue;
            }
            System.out.println(num);
            num++;
        }

        */

        //if gender is F -female
        //if gender is M - Male

//        String gender="M";//m
//
//        System.out.println(" Enter Gender ");
//        String userInput=scanner.next();

        //Johnn == John

        //String
        //trim -
        //split
        //equality

//        if (gender.equalsIgnoreCase(userInput)){
//            System.out.println("Male");
//        } else{
//            System.out.println("Female");
//        }
        //1 0
//        System.out.println(gender.equalsIgnoreCase(userInput) ? "Male" : "Female");
//        scanner.close();
    }

}
