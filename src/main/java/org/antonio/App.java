package org.antonio;

import org.antonio.dao.UserDAO;
import org.antonio.model.User;

import java.util.List;

public class App {
  public static void main(String[] args) {
    UserDAO userDAO = new UserDAO();

    try {
      userDAO.addUser(new User(1, "RATOLOJANAHARY", "ratolojanaharyantonio.com"));
      List<User> users = userDAO.getAllUsers();

      for (User user : users) {
        System.out.println(user);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
