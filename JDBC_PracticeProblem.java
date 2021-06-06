package com.bridgelabz.jdbc;
import java.sql.*;

public class JDBC_PracticeProblem {
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_service","root","mysql");
            System.out.println("Connection eastablished");
        }


        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();

    }

    }
}
