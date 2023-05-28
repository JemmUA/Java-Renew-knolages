package hilelll.jdbc.practice2.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static String URL = "jdbc:postgresql://localhost:5432/jDB";
    private static String USERNAME = "postgres";
    private static String PASSWORD = "postgres";


    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver"); // Registration of Driver
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD); // Connection from JDBC API
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
