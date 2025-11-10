package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * org.example.Database
 * ----------
 * Centralizes JDBC connection details (no env file).
 * Update URL/USER/PASSWORD to match your local PostgreSQL setup.
 */
public class Database {
    private static final String URL = "jdbc:postgresql://localhost:5432/A3";
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgres"; // <-- change as needed

    /**
     * Opens a new connection to PostgreSQL.
     * Uses DriverManager with the URL/USER/PASSWORD above.
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
