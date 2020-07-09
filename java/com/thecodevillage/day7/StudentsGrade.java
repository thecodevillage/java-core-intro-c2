package com.thecodevillage.day7;

import java.util.Scanner;

public class StudentsGrade {


    //system allows a teacher capture 3 students details
    //enhancement cpature n..
    //name, regnumber, subjects  (5) -> ENG,MATH, KISW, SCI,BIO and scores
    //capture n subjects
    //you will output details and Mean score and grade

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int noOfStudents = 0;
        int totalMarks=0;
        double meanScore=0;
        String meanGrade="";
        String studentName="";
        String regNo="";

        System.out.println("Enter No of Students ");
        noOfStudents = scanner.nextInt();

        if (noOfStudents > 0){
            int noOfSubjects = 0;
            int counter = 1;

            int studentTotalMarks=0;
            double studentMeanScore=0;
            String studentMeanGrade="";

            while(counter <= noOfStudents){ //gets students
                System.out.println("Enter name of Student ");
                studentName = scanner.next();

                System.out.println("Enter Reg No ");
                regNo = scanner.next();

                System.out.println("Enter No of Subjects ");
                noOfSubjects = scanner.nextInt();
                if (noOfSubjects > 0){
                    String subjectName="";
                    int marks= 0;

                    for (int i=0; i<noOfSubjects; i++){ //gets the subjects
                        System.out.println("Enter name of Subject ");
                        subjectName = scanner.next();
                        System.out.println("Enter Marks ");
                        marks = scanner.nextInt();
                        studentTotalMarks += marks;
                    }
                }

                print("**************");
                print("Name : "+studentName);
                print("RegNo : "+regNo);
                print("Total Marks : "+studentTotalMarks);
                print("**************");

                counter++;
            }
        } else{
            System.out.println(" Enter Number greater than 0");
        }

    }


    static String getGrade(int mean){
        String grade="";
        if(mean >=0 && mean <= 40)
            grade = "D";
        else if(mean > 40 && mean <= 60)
            grade = "C";
        else if(mean > 60  && mean <= 80)
            grade = "B";
        else if(mean > 80 && mean <= 100) {
            grade = "A";
        }
        else
            grade = "F";
        return grade;
    }
    static void print(String message){
        System.out.println(message);
    }


}
