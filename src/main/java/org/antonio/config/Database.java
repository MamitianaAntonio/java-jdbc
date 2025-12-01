package org.antonio.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
  private static final String URL = "jdbc:postgresql://localhost:5432/java_jdbc";
  private static final String USER = "postgres";
  private static final String PASSWORD = "Antonio@01";

  public Connection getConnection() throws SQLException {
    return DriverManager.getConnection(URL, USER, PASSWORD);
  }
}
