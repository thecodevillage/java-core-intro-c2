package com.thecodevillage.day11.example1;

public class GermanShephered extends Dog {
    private boolean hasShortFur;

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
