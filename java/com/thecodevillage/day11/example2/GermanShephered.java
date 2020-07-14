package com.thecodevillage.day11.example2;

public class GermanShephered extends Dog  {
    private boolean hasShortFur;

    public GermanShephered(String name, String color,boolean hasShortFur) {
        super(name, color);
        this.hasShortFur = hasShortFur;
    }

    public boolean isHasShortFur() {
        return hasShortFur;
    }

    public void setHasShortFur(boolean hasShortFur) {
        this.hasShortFur = hasShortFur;
    }


    public void canSniff(){
        System.out.println("G SHEP can Sniff");
    }
}
