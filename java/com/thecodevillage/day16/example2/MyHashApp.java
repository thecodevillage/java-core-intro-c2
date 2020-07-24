package com.thecodevillage.day16.example2;

import java.util.HashMap;
import java.util.Scanner;

public class MyHashApp {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        HashMap<String,String> names=new HashMap<>();
        names.put("firstName","John");
        names.put("lastName","Doe");
        System.out.println(names.get("firstName"));
        System.out.println(names.get("lastName"));


        HashMap<String,Student> students=new HashMap<>();
        students.put("1234",new Student("John Doe","1234"));
        students.put("3232",new Student("Jane M","3232"));
        students.put("9898",new Student("Mary J ","9898"));

        System.out.println("Enter Reg Number");
        String regNo= scanner.next();
        Student stud=students.get(regNo);
        if (stud!=null){
            System.out.println("Name: "+stud.getName());
            System.out.println("Reg NO: "+stud.getRegNo());
        } else {
            System.out.println("Invalid Reg No");
        }

        //clear()
        //remove(key)
        System.out.println("Looping ");

        for (String key: students.keySet()){
            System.out.println(key);
        }

        System.out.println("Looping Values ");
        for (Student student: students.values()){
            System.out.println("Name: "+ student.getName());
            System.out.println("Reg No:"+student.getRegNo());
        }

    }
}
