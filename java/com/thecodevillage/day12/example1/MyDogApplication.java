package com.thecodevillage.day12.example1;


public class MyDogApplication {

    public static void main(String[] args){

        Bulldog bulldog=new Bulldog("A Bulldog","Black","Has Very Long Tail");
        System.out.println("Name :"+bulldog.getName());
        System.out.println("Color :"+bulldog.getColor());
        System.out.println("Tail :"+bulldog.getLongTail());

        bulldog.canBark();

    }
}
