package com.thecodevillage.day11.example2;

public class MyDogApplication {

    public static void main(String[] args){

        Bulldog bulldog=new Bulldog("A Bulldog","Black","Has Very Long Tail");
        System.out.println("Name :"+bulldog.getName());
        System.out.println("Color :"+bulldog.getColor());
        System.out.println("Tail :"+bulldog.getLongTail());

        bulldog.canBark();
        bulldog.canFetch();

        System.out.println("\n\n*******************");
        GermanShephered germanShephered=new GermanShephered("GM Shep Dog","Grey",true);

        System.out.println("Name :"+germanShephered.getName());
        System.out.println("Color :"+germanShephered.getColor());
        String hasShortFur = germanShephered.isHasShortFur() ? "YES" : "NO";
        System.out.println("Has Short Fur :" + hasShortFur);
        germanShephered.canBark();
        germanShephered.canSniff();


        System.out.println("\n\n*******************");
        Bulldog1 bulldog1=new Bulldog1("Bulldog 1","White","Short Tail",false);

        System.out.println("Name :"+bulldog1.getName());
        System.out.println("Color :"+bulldog1.getColor());
        System.out.println("Long Tail :" + bulldog1.getLongTail());
        String canHunt = bulldog1.isCanHunt() ? "YES" : "NO";
        System.out.println("Can Hunt :" + canHunt);

    }
}
