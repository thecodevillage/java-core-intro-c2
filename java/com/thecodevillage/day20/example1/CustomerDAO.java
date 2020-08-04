package com.thecodevillage.day20.example1;

import java.util.List;

public interface CustomerDAO {

    List<BankMenu> getAllMenus();

    List<Customer> getAllCustomers();

    Customer getCustomerById(int id);

    List<Account> getAccountsByCustomerId(int customerId);

}
