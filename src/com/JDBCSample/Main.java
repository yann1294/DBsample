package com.JDBCSample;

import Tables.students;

import java.sql.*;

public class Main {


    public static void main(String[] args) throws SQLException {
	// write your code here


        /**
         * Steps to retrieve data from the database
         * -----------
         */

        /**
         * -----------
         */
        try(Connection con = DBConnection.getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("SELECT * FROM students ");
            )
        {



           // System.out.println("Connected");

            //System.out.println(rs.getRow());

            students.getStudents(rs);
            // moving cursor on the last student.
            rs.last();
            System.out.println("Last Student is " + rs.getInt("id") + " " + rs.getString("first_name") + " " + rs.getString("last_name") + " " + rs.getDate("dob"));

            //moving cursor on the first student.
            rs.first();
            System.out.println("First Student is " + rs.getInt("id") + " " + rs.getString("first_name") + " " + rs.getString("last_name") + " " + rs.getDate("dob"));

            //moving cursor on a random student.
            rs.absolute(3);
            System.out.println("Student is " + rs.getInt("id") + " " + rs.getString("first_name") + " " + rs.getString("last_name") + " " + rs.getDate("dob"));

        } catch (SQLException e){
            System.err.print(e);
        }




    }
}
