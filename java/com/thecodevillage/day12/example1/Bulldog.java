package com.thecodevillage.day12.example1;

public class Bulldog extends Dog {
    private String longTail;

    public Bulldog(String name, String color, String longTail) {
        super(name, color);
        this.longTail = longTail;
    }

    public String getLongTail() {
        return longTail;
    }

    public void setLongTail(String longTail) {
        this.longTail = longTail;
    }


    public void canFetch(){
        System.out.println("Bulldog can Fetch");
    }

    public void canBark(){
        System.out.println("BullDog Can Bark");
    }


}
