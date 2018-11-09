package com.JDBCSample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {


    private static final String USERNAME = "abi";
    private static final String PASSWORD= "12345";
    private static final String CONN = "jdbc:mysql://localhost/School";

        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(CONN,USERNAME,PASSWORD);
        }
}
