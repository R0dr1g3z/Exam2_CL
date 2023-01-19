package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) throws SQLException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give id");
        int id = scan.nextInt();
        try(Connection connection = DbUtil.connect("exam2")){
            String queryMessages = "SELECT message FROM users JOIN messages ON users.id=messages.user_id WHERE users.id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(queryMessages);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("This is all messages user ID " + id + ":");
            while(resultSet.next()){
                System.out.println(resultSet.getString("message"));
            }
        }
        try(Connection connection = DbUtil.connect("exam2")){
            String queryOrders = "SELECT * FROM users JOIN orders ON users.id=orders.user_id WHERE users.id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(queryOrders);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("This is all orders user ID " + id + ":");
            while(resultSet.next()){
                System.out.println(resultSet.getString("description"));
            }
        }
    }
}
