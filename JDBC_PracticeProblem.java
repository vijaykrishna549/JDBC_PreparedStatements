package com.bridgelabz.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_PracticeProblem {
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_service","root","mysql");
            System.out.println("Connection eastablished");
            PreparedStatement stmt = connection.prepareStatement("update payroll set basic_pay = ? where Emp_ref_id = ?");
            stmt.setDouble(1,3000000);
            stmt.setInt(2,2);
            stmt.executeUpdate();





            // Statement stmt = connection.createStatement();
           /* ResultSet resultSet = stmt.executeQuery("select * from employee");
            while(resultSet.next())
            {
                System.out.println(resultSet.getInt("Emp_id")+ " " + resultSet.getString("name")+ " " + resultSet.getString("phone_number")
                +" "+ resultSet.getString("address")+" "+resultSet.getString("gender")+" "+resultSet.getDate("start"));
            }*/
        }


        catch (ClassNotFoundException | SQLException e)
        {
            System.out.println("poijhbv");

    }

    }
}
