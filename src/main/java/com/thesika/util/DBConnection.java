package com.thesika.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    
    private static final String URL = "jdbc:postgresql://thesimart_db:qniQHsEIoZLr7QbEMDQvP4ZMlUvm6fkk@dpg-db54ad7lot8c73dm6d6g-a.oregon-postgres.render.com/thesimart_db";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("PostgreSQL Driver not found!", e);
        }
        return DriverManager.getConnection(URL);
    }
}
