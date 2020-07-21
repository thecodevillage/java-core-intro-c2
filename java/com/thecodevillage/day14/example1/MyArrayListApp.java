package com.thecodevillage.day14.example1;



import java.util.ArrayList;

public class MyArrayListApp {

    public static void main(String[] args) {
        ArrayList<Integer> scores=new ArrayList<>();

        scores.add(20);
        scores.add(100);
        scores.add(200);
        scores.add(50);

        System.out.println(" Get First Item");
        System.out.println("Score 3: \t"+scores.get(2));

        System.out.println(" Change Value in Pos 3");
        scores.set(2,500);

        System.out.println("Score 3: \t"+scores.get(2));
        System.out.println("Before Remove ");
        System.out.println(scores);
        scores.remove(2);
        System.out.println("After Remove ");
        System.out.println(scores);


        System.out.println("SIZE: "+scores.size());

        System.out.println("For Loop");

        for (int i=0;i < scores.size() ;i++){
            System.out.println("Score: "+scores.get(i));
        }

        System.out.println("Foreach loop");
        for (int score: scores
             ) {
            System.out.println("Score: "+score);

        }

    }
}
