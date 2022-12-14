package jm.task.core.jdbc.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.lang.Class.*;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "Isa.211003";
    //public static Connection getConnection;

    public static Connection getConnection() {
        Connection connection = null;
        try {
            forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
            if (!connection.isClosed()) {
                System.out.println("Соединение с БД установлено");
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e ) {
            System.err.println("Не удалось загрузить класс драйвера");
        }
        return connection;


    }


}