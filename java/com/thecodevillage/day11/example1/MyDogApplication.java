package com.thecodevillage.day11.example1;

public class MyDogApplication {

    public static void main(String[] args){

        Bulldog bulldog=new Bulldog();
        bulldog.setLongTail("Has Very Long Tail");
        bulldog.name = "A Bulldog";
        bulldog.color = "Black";


        System.out.println("Name :"+bulldog.name);
        System.out.println("Color :"+bulldog.color);
        System.out.println("Tail :"+bulldog.getLongTail());

        bulldog.canBark();
        bulldog.canFetch();

        System.out.println("\n\n*******************");
        GermanShephered germanShephered=new GermanShephered();
        germanShephered.name = "GM Shep Dog";
        germanShephered.color = "Grey";
        germanShephered.setHasShortFur(true);


        System.out.println("Name :"+germanShephered.name);
        System.out.println("Color :"+germanShephered.color);
        String hasShortFur = germanShephered.isHasShortFur() ? "YES" : "NO";
        System.out.println("Has Short Fur :" + hasShortFur);

        germanShephered.canBark();
        germanShephered.canSniff();

    }
}
