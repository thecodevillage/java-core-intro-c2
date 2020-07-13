package com.thecodevillage.day10.task1;
public class StudentApp {

    public static void main(String[] args){
        Student student=new Student();
        student.name="John Doe";
        student.regNumber="4353453";
        student.age=25;
        System.out.println("The Name is: "+student.name);
        System.out.println("The Reg is: "+student.regNumber);
        System.out.println("The Age is: "+student.age);

    }
}
