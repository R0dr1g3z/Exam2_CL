package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) throws SQLException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give name");
        String name = scan.nextLine();
        System.out.println("Give description");
        String description = scan.nextLine();
        System.out.println("Give price");
        int price = scan.nextInt();
        try(Connection connection = DbUtil.connect("exam2")){
            String query = "INSERT INTO items(name,description,price) VALUES(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, description);
            preparedStatement.setInt(3, price);
            preparedStatement.executeUpdate();
        }
    }
}
