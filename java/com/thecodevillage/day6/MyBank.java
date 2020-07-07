package com.thecodevillage.day6;

import java.util.Scanner;

public class MyBank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int customerPin = 1234;
        int pinInput = 0;
        double depositInput = 0;
        double balance = 5000;
        int choice = 0;

        System.out.println(" Welcome to my Bank ");
        System.out.println(" Enter your PIN");
        pinInput = scanner.nextInt();

        if (customerPin != pinInput)
            System.out.println(" PIn Entered Invalid ");
        else {
            System.out.println(" - Menu -");
            System.out.println("1\t Check Balance");
            System.out.println("2\t Deposit");
            System.out.println("3\t Withdraw");
            System.out.println("0\t Exit");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Balance is :" + balance);
            }
            if (choice == 2) {
                System.out.println(" enter the amount ");
                depositInput = scanner.nextInt();
                balance += depositInput;

                System.out.println("NEW BALANCE: " + balance);
            }

            if (choice == 3) {

            }

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

    //enhancements

    // we don't the program to terminate until a user selects an option

    //conditional loops while loop, do while
}
