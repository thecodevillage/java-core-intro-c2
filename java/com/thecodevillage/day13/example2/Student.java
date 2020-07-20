package com.thecodevillage.day13.example2;

public class Student {

    private String name;
    private String regNumber;
    private int age;
    private int scores[];

    public Student() {
    }

    public Student(String name, String regNumber, int age) {
        this.name = name;
        this.regNumber = regNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }
}
