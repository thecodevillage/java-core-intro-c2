package com.thecodevillage.day14.example2;

public class Fruit {
    private String name;
    private String color;
    private boolean hasSeeds;

    public Fruit() {
    }

    public Fruit(String name, String color, boolean hasSeeds) {
        this.name = name;
        this.color = color;
        this.hasSeeds = hasSeeds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasSeeds() {
        return hasSeeds;
    }

    public void setHasSeeds(boolean hasSeeds) {
        this.hasSeeds = hasSeeds;
    }
}
