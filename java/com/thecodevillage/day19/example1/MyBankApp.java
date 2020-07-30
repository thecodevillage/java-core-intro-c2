package com.thecodevillage.day19.example1;


import java.sql.*;
import java.util.Scanner;

public class MyBankApp {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Connection connection = null;
        Statement statement = null; //allow us issue queries
        ResultSet resultSet = null;
        PreparedStatement preparedStatement;
        /**
         * Try catch is way for us to tell compile what to do in case an error occurs
         */
        try{
            //define the driver
//
//            Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            //connect to the database using connection url
            //username & password
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_core_c2?user=root&password=dbpassword");

            //after connection we need to issue queries to the db
            statement = connection.createStatement();

            //select query
            resultSet = statement.executeQuery("select * from customer;");
            while (resultSet.next()){
                System.out.println("ID: "+resultSet.getInt("id"));
                System.out.println("ID NUMBER: "+resultSet.getString("id_number"));
                System.out.println("Full Name: "+resultSet.getString("full_name"));
                System.out.println("Gender: "+resultSet.getString("gender"));
                System.out.println("**************************");

            }


            //insert customer into the database
            System.out.println("Enter Name");
            String name=scanner.next();

            System.out.println("Enter ID Number");
            String idNumber=scanner.next();

            System.out.println("Enter gender");
            String gender=scanner.next();


            preparedStatement = connection.prepareStatement("insert into customer(id_number,full_name,gender) values(?,?,?)");
            preparedStatement.setString(1,idNumber);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,gender);
            preparedStatement.executeUpdate();



            //select query
            resultSet = statement.executeQuery("select * from customer;");
            while (resultSet.next()){
                System.out.println("ID: "+resultSet.getInt("id"));
                System.out.println("ID NUMBER: "+resultSet.getString("id_number"));
                System.out.println("Full Name: "+resultSet.getString("full_name"));
                System.out.println("Gender: "+resultSet.getString("gender"));
                System.out.println("**************************");

            }



        } catch (Exception ex){
            ex.printStackTrace();
        } finally {
            if (connection!=null || resultSet!=null){
                try {
                    connection.close();
                    resultSet.close();
                } catch (Exception ex){

                }

            }

        }


    }
}
