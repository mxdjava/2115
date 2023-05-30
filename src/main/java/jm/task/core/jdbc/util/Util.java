package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DB_URL = "jdbc:mysql://localhost/db114";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "Mirazebl815784_";

    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            System.out.println("Connection succeeded");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection error");
        }
//        connection.setAutoCommit(false);
        return connection;
    }
}
