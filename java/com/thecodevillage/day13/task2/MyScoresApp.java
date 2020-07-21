package com.thecodevillage.day13.task2;

import java.util.Scanner;

public class MyScoresApp {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int[] scores = new int[0];
        int score=0;
        System.out.println(" Enter No of Scores ");
        int noOfScores = scanner.nextInt();

        if (noOfScores > 0){
            scores = new int[noOfScores];

            for (int i=0; i < noOfScores ; i++){
                System.out.println("Enter Score "+i+1);
                score = scanner.nextInt();
                scores[i] = score;
            }
        }
        System.out.println("-- Array Details --");
        if (scores.length > 0){
            for (int i=0; i < scores.length ; i++){
                System.out.println("Score "+i+1+":\t"+scores[i]);
            }

            System.out.println("SUM:\t"+sum(scores));
            System.out.println("MEAN:\t"+mean(scores));
        }
        
    }

    static int sum(int[] scores){
        int sum =0;
        for (int i=0; i < scores.length ; i++){
            sum+=scores[i];
        }
        return sum;
    }

    static int mean(int[] scores){
        int sum = sum(scores);
        return sum / scores.length;
    }

}


/**
 1. define an array of scores length 10

 2. write a a for loop to output each score

 3. also output total sum and mean score

 NB:
 - allow the user to enter the no.of scores
 - allow user to enter the scores

 - a function that takes an array of scores and return the sum.
 - a function that takes an array of scores and return the mean

 **/