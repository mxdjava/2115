package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Vasya", "Popov", (byte) 34);
        userService.saveUser("Georgy", "Akopyan", (byte) 55);
        userService.saveUser("Moisei", "Zukerman", (byte) 20);
        userService.saveUser("Zamir", "Zakiev", (byte) 62);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
