package com.thecodevillage.day16.example1;

import java.util.Scanner;

public class MyEnumApp {
    //Menus
    //SEND
    //WITHDRAW
    //DEPOSIT

    //AccountType


//    if(menu == deposit)

    //enum

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        //BankMenu deposit = BankMenu.DEPOSIT;
        //System.out.println("Deposit: "+deposit);


        System.out.println("Enter the MENU Type");
        String inp=scanner.next();

        if (inp.equalsIgnoreCase(BankMenu.DEPOSIT.name())){
            System.out.println(" Deposit Menu Selected "+BankMenu.DEPOSIT);
        }

        Account account=new Account();
        account.setAccountType(AccountType.FIXED_DEPOSIT);
        //AccountType.values().length
        for (AccountType acc: AccountType.values()
             ) {
            System.out.println(acc);
        }



    }


}
