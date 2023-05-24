package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        /*Util util = new Util();
        try {
            Util.getConnection();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }*/
        Connection connection = Util.getConnection();
        UserDao userDao = new UserDaoJDBCImpl(connection);
        UserService userServiceImpl = new UserServiceImpl(userDao);

        userServiceImpl.createUsersTable();
        userServiceImpl.saveUser("Vasya", "Popov", (byte) 34);
        userServiceImpl.saveUser("Georgy", "Akopyan", (byte) 55);
        userServiceImpl.saveUser("Moisei", "Zukerman", (byte) 20);
        userServiceImpl.saveUser("Zamir", "Zakiev", (byte) 62);
//        userServiceImpl.getAllUsers();
//        userServiceImpl.cleanUsersTable();
        userServiceImpl.dropUsersTable();
    }
}
