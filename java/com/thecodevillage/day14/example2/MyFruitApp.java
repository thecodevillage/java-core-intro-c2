package com.thecodevillage.day14.example2;

import java.util.ArrayList;

public class MyFruitApp {
    public static void main(String[] args) {
        Fruit mango =  new Fruit("Mango","Yellow",true);
        Fruit passion =  new Fruit("Passion","Purple",true);
        Fruit banana =  new Fruit("Banana","Yellow",true);
        ArrayList<Fruit> fruits=new ArrayList<>();
        fruits.add(mango);
        fruits.add(passion);
        fruits.add(banana);


        for (int i=0; i < fruits.size(); i++){
            System.out.println("NAME: "+fruits.get(i).getName());
            System.out.println("COLOR: "+fruits.get(i).getColor());
            String hasSeeds = fruits.get(i).isHasSeeds() ? "YES": "NO";
            System.out.println("HAS SEEDS: "+hasSeeds);
            System.out.println("********************");
        }


    }
}
