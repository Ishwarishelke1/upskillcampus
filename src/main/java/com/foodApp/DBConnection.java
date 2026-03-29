package com.foodApp;
import java.sql.*;
public class DBConnection {
	public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/food_delivery",
                "root",
                "root"
            );

            return con;

        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
