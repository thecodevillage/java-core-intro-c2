package com.thecodevillage.day11.example2;

public class Bulldog1 extends Bulldog {

    private boolean canHunt;

    public Bulldog1(String name, String color, String longTail,boolean canHunt) {
        super(name, color, longTail);
        this.canHunt = canHunt;

    }


    public boolean isCanHunt() {
        return canHunt;
    }

    public void setCanHunt(boolean canHunt) {
        this.canHunt = canHunt;
    }
}
