package com.thecodevillage.day10;

public class MyCar {
    private String name="Volvo";
    private String regNumber = "KaX 3843U";
    private String color="Red";


    public static void main(String[] args){
        MyCar volvo=new MyCar();
        MyCar toyota=new MyCar();
        MyCar bmw=new MyCar();
        System.out.println("The Name is: "+volvo.name);
        System.out.println("The Reg is: "+volvo.regNumber);
        System.out.println("The Color is: "+volvo.color);

        System.out.println("--------Toyota------");
        System.out.println("The Toyota Name is: "+toyota.name);
        System.out.println("The Toyota Reg is: "+toyota.regNumber);
        System.out.println("The Toyota Color is: "+toyota.color);


        System.out.println("--------BMW------");
        bmw.name = "BMW M5";
        bmw.color = "Black";
        bmw.regNumber = "KCX 724B";
        System.out.println("The BWM Name is: "+bmw.name);
        System.out.println("The BMW Reg is: "+bmw.regNumber);
        System.out.println("The BMW Color is: "+bmw.color);
    }



}
