package com.thecodevillage.day19.example1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyBankApp {

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null; //allow us issue queries
        ResultSet resultSet = null;
        /**
         * Try catch is way for us to tell compile what to do in case an error occurs
         */
        try{
            //define the driver
            Class.forName("com.mysql.jdbc.Driver");

            //connect to the database using connection url
            //username & password
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_core_c2?user=root&password=passw");

            //after connection we need to issue queries to the db
            statement = connection.createStatement();

            //select query
            resultSet = statement.executeQuery("select * from customer");

            while (resultSet.next()){
                System.out.println(resultSet.getString("full_name"));
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
