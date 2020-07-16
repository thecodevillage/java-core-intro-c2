package com.thecodevillage.day12.example3;

public class Bulldog implements DogInterface {
    private String longTail;


    @Override
    public void bark() {
        System.out.println("Bulldog is barking");
    }

    @Override
    public void eat() {
        System.out.println("Bulldog is feeding");
    }

    @Override
    public void bite() {
        System.out.println("Bulldog is about to bite");
    }
}
