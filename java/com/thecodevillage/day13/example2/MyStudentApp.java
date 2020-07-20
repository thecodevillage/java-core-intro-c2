package com.thecodevillage.day13.example2;

import java.util.Scanner;

public class MyStudentApp {

    public static void main(String[] args){

        Student[] students=new Student[3];

        Student student1=new Student("John","53535",20);
        Student student2=new Student("Jane","24sGHG",15);
        Student student3=new Student("Dennis","2313",12);

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;


        System.out.println("Output with foreach ");
        for (Student student: students
             ) {
            System.out.println("********************");
            System.out.println("NAME: "+student.getName());
            System.out.println("REG: "+student.getRegNumber());
            System.out.println("AGE: "+student.getAge());
            System.out.println("********************");
        }

        System.out.println("Output with for loop");
        for (int i=0; i < students.length; i++
        ) {
            System.out.println("********************");
            System.out.println("NAME: "+students[i].getName());
            System.out.println("REG: "+students[i].getRegNumber());
            System.out.println("AGE: "+students[i].getAge());
            System.out.println("********************");
        }

        Scanner scanner=new Scanner(System.in);
        System.out.println(" Enter number of ");
        int noofscores = scanner.nextInt();

        int scores[] = new int[noofscores];

        student1.setScores(scores);

    }


    int sum(int[] scores){
        int sum = 0;
        for (int score: scores
             ) {
            sum+=score;
        }
        return sum;
    }

    int[] myreturnArrayMethod(int[] scores){
        int[] someArray=new int[4];
        return someArray;
    }
}
