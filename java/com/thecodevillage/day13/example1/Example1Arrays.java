package com.thecodevillage.day13.example1;

public class Example1Arrays {

   public static void main(String[]args) {
       String[] students;
      students = new String[]{"John", "Nick", "Elvis"};

       System.out.println("Length is: "+students.length);
       System.out.println("1st  is: "+students[0]);
       System.out.println("2nd  is: "+students[1]);
       System.out.println("3rd  is: "+students[2]);
       //System.out.println("4th  is: "+students[3]);

       students[1] = "Dennis";

       System.out.println("Length is: "+students.length);
       System.out.println("1st  is: "+students[0]);
       System.out.println("2nd  is: "+students[1]);
       System.out.println("3rd  is: "+students[2]);

       System.out.println("Array of Ints");
       int[] scores = new int[10];
       scores[0] = 20;
       scores[1] = 34;
       scores[2] = 12;
       scores[3] = 18;

       System.out.println(scores.length);
       System.out.println(scores[9]);

       System.out.println("Looping Students with For Loop");
       for (int i=0; i < students.length; i++){
           System.out.println("Name: "+students[i]);
       }

       System.out.println("Looping Students with Foreach Loop");
       for (String name: students) {
           System.out.println("Name: "+name);
       }




    }
}
