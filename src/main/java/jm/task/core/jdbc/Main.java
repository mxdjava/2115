package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
import org.hibernate.SessionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        SessionFactory sessionFactory = Util.getSessionFactory();
        UserDao userDao = new UserDaoHibernateImpl(sessionFactory);

        userDao.createUsersTable();
        userDao.saveUser("Vasya", "Popov", (byte) 34);
        userDao.saveUser("Georgy", "Akopyan", (byte) 55);
        userDao.saveUser("Moisei", "Zukerman", (byte) 20);
        userDao.saveUser("Zamir", "Zakiev", (byte) 62);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
        sessionFactory.close();
    }
}
