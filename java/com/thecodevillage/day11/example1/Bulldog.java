package com.thecodevillage.day11.example1;

public class Bulldog extends Dog {
    private String longTail="";


    public String getLongTail() {
        return longTail;
    }

    public void setLongTail(String longTail) {
        this.longTail = longTail;
    }


    public void canFetch(){
        System.out.println("Bulldog can Fetch");
    }
}
