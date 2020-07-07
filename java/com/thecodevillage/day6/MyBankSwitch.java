package com.thecodevillage.day6;

import java.util.Scanner;

public class MyBankSwitch {

    static Scanner scanner = new Scanner(System.in);
    static double depositInput = 0;
    static double balance = 5000;

    //functions
    //return type
    //arguments -

    public static void main(String[] args) {


        int customerPin = 1234;
        int pinInput = 0;
        int choice = 0;

        System.out.println(" Welcome to my Bank ");
        System.out.println(" Enter your PIN");
        pinInput = scanner.nextInt();

        if (customerPin != pinInput)
            System.out.println(" PIn Entered Invalid ");
        else{
            System.out.println(" - Menu -");
            System.out.println("1\t Check Balance");
            System.out.println("2\t Deposit");
            System.out.println("3\t Withdraw");
            choice = scanner.nextInt();

            bankOption(choice);

        }
    }


    static void bankOption(int choice){
        switch (choice){
            case 1:
                System.out.println("Balance is :"+balance);
                break;
            case 2:
                System.out.println(" enter the amount ");
                depositInput = scanner.nextInt();
                balance +=depositInput;
                System.out.println("NEW BALANCE: "+balance);
                break;
            case 3:
                break;
            default:
                System.out.println(" Invalid Option selected ");
        }
    }

    //build simple program to mimick your bank mobile experience
    //check balance
    //deposit
    //withdraw
    //send money

    //ask your customer to input pin
    //check if the pin is correct
    //if its correct
    //display menu option
    //e.g Press 1 - to check balance ,2 to deposit
    //display balance if 1 is selected
    //when they select2 allow them enter amount
    //then display the new balance
    //

    //
}
