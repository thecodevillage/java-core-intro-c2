package com.thecodevillage.day20.example1;

import com.thecodevillage.day9.MyFunctions;

import java.util.List;

public class BankingApp {

    public static void main(String[] args) {

        //create db
        List<Customer> customers=MyDBFunctions.getAllCustomers();

        System.out.println("Customers##\t"+customers.size());

        Customer customer=MyDBFunctions.getCustomerById(1);
        if (customer!=null){
            System.out.println("ID: "+customer.getId());
            System.out.println("ID NUMBER: "+customer.getIdNumber());
            System.out.println("Full Name: "+customer.getFullName());
            System.out.println("Gender: "+customer.getGender());
            System.out.println("**************************");
        }


        List<Account> accounts=MyDBFunctions.getAccountsByCustomerId(1);

        for (Account account: accounts
             ) {
            System.out.println("ID: "+account.getId());
            System.out.println("NUMBER: "+account.getAccountNumber());
            System.out.println("TYPE: "+account.getAccountType());
            System.out.println("BALANCE: "+account.getBalance());
            System.out.println("**************************");

        }

        System.out.println("Accounts##\t"+accounts.size());


        CustomerDAOImpl customerDAO=new CustomerDAOImpl();
        customerDAO.getAccountsByCustomerId(1);


    }
}
