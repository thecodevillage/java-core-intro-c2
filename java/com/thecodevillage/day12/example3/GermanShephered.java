package com.thecodevillage.day12.example3;

public class GermanShephered extends Dog implements DogInterface {
    private boolean hasShortFur;

    public boolean isHasShortFur() {
        return hasShortFur;
    }

    public void setHasShortFur(boolean hasShortFur) {
        this.hasShortFur = hasShortFur;
    }


    public void canSniff() {
        System.out.println("G SHEP can Sniff");
    }


    @Override
    public void bark() {
        System.out.println("GMS is barking");
    }

    @Override
    public void eat() {
        System.out.println("GMS is feeding");
    }

    @Override
    public void bite() {
        System.out.println("GMS is about to bite");
    }
}
