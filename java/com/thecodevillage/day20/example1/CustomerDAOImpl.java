package com.thecodevillage.day20.example1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {
     Connection connection = null;
     ResultSet resultSet = null;
     PreparedStatement preparedStatement = null;
     Statement statement = null;

    private  Connection getDatabaseConnection() {
        try {
            //define the driver
//            Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            //connect to the database using connection url
            //username & password
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_core_c2?user=root&password=smartcode");
            statement = connection.createStatement();

        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return connection;
    }


    private void closeConnections(){
        try{
            if (connection!=null){
                connection.close();
            }

            if (statement!=null){
                statement.close();
            }

            if (resultSet!=null){
                resultSet.close();
            }

            if (preparedStatement!=null){
                preparedStatement.close();
            }

        } catch (Exception exception){
            exception.printStackTrace();
        }
    }

    @Override
    public List<BankMenu> getAllMenus() {
        List<BankMenu> bankMenus=new ArrayList<>();
        bankMenus.add(new BankMenu(1,"1001","Send Money"));
        bankMenus.add(new BankMenu(2,"1002","Balance"));
        bankMenus.add(new BankMenu(2,"1003","Transfer"));
        return bankMenus;
    }

    @Override
    public List<Customer> getAllCustomers() {
        System.out.println("Get all The Customers ");
        getDatabaseConnection();
        List<Customer> customers=new ArrayList<>();
        try {
            //select query
            resultSet = statement.executeQuery("select * from customer;");
            while (resultSet.next()){
                customers.add(new Customer(resultSet.getInt("id"),
                        resultSet.getString("id_number"),
                        resultSet.getString("full_name"),
                        resultSet.getString("gender")));
            }
        } catch (Exception exception){
            exception.printStackTrace();
        }

        return customers;
    }

    @Override
    public Customer getCustomerById(int id) {
        Customer customer=null;
        try {
            //select query
            preparedStatement = connection.prepareStatement("select * from customer where id=?",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
//            preparedStatement = connection.prepareStatement("select * from customer where id=?");
            preparedStatement.setInt(1,id);
//            resultSet = statement.executeQuery("select * from customer where id= '"+id+"';");
            resultSet = preparedStatement.executeQuery();
            resultSet.first();
//            resultSet.beforeFirst();

            //cursor
            customer = new Customer(resultSet.getInt("id"),
                    resultSet.getString("id_number"),
                    resultSet.getString("full_name"),
                    resultSet.getString("gender"));

        } catch (Exception exception){
            exception.printStackTrace();
        }

        return customer;
    }

    @Override
    public List<Account> getAccountsByCustomerId(int customerId) {
        System.out.println("Get all The Customer's Account ");
        getDatabaseConnection();
        List<Account> accounts=new ArrayList<>();
        try {
            //select query
            resultSet = statement.executeQuery("select * from account where customer_id = '"+customerId+"';");
            while (resultSet.next()){
                accounts.add(new Account(resultSet.getInt("id"),
                        resultSet.getString("account_number"),
                        AccountType.CURRENT,
                        resultSet.getDouble("balance")));
            }
        } catch (Exception exception){
            exception.printStackTrace();
        }

        return accounts;
    }
}
