package com.thecodevillage.day10;

public class MyCarApplication {

    public static void main(String[] args){
        MyCar2 volvo=new MyCar2();
        System.out.println("The Name is: "+volvo.name);
        System.out.println("The Reg is: "+volvo.regNumber);
        System.out.println("The Color is: "+volvo.color);
        System.out.println("The Color is: "+volvo.brand);

        MyCar2.stopCar();

        volvo.accelerate();

        System.out.println(" -- Constructors --");
        MyCar3 forester=new MyCar3("Forester","KCU 674M","Blue","SUBARU");
        forester.make = "4 wheeld";

        MyCar3 amg=new MyCar3("AMG","KCA 432M","Black","Mercedes");
        amg.make = "AWD";

        System.out.println(" Forester Car 3");
        System.out.println("The Name is: "+forester.name);
        System.out.println("The Reg is: "+forester.regNumber);
        System.out.println("The Color is: "+forester.color);
        System.out.println("The Color is: "+forester.brand);


        System.out.println(" Benz Car 4");
        System.out.println("The Name is: "+amg.name);
        System.out.println("The Reg is: "+amg.regNumber);
        System.out.println("The Color is: "+amg.color);
        System.out.println("The Color is: "+amg.brand);


        System.out.println(" -- Constructors --");
        MyCar3 fielder=new MyCar3();
        fielder.name="Toyota Fielder";
        fielder.regNumber="Kaz jjkqs";
        fielder.color="Maroon";
        fielder.make = "2 WD";

        System.out.println(" --- Car fielder --");
        System.out.println("The Name is: "+fielder.name);
        System.out.println("The Reg is: "+fielder.regNumber);
        System.out.println("The Color is: "+fielder.color);
        System.out.println("The Color is: "+fielder.brand);


        System.out.println(" Getters & Setters ");
        MyCar4 myCar4=new MyCar4();

        System.out.println("The Original Name is: "+myCar4.getName());

        //myCar4.setName("BMW M5");

        System.out.println("The Name is: "+myCar4.getName());
        System.out.println("The Reg is: "+myCar4.getRegNumber());

        //myCar4.setRegNumber("KBU 342M");

        System.out.println("The New Reg is: "+myCar4.getRegNumber());







    }
}
