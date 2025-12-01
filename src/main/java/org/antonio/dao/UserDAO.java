package org.antonio.dao;

import org.antonio.config.Database;
import org.antonio.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
  // get all user
  public List<User> getAllUsers() throws Exception {
    List<User> users = new ArrayList<>();
    String sql = "SELECT id, name, email FROM users";

    try (Connection conn = Database.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

      while (rs.next()) {
        User user = new User(
            rs.getInt("id"),
            rs.getString("name"),
            rs.getString("email")
        );
        users.add(user);
      }
    }
    return users;
  }
}
