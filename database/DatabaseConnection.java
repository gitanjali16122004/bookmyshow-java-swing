
package bookmyshow;

import java.sql.*;

public class DatabaseConnection {
   
    private static final String DB_URL = "jdbc:mysql://localhost:3306/bookmyshow";  
    private static final String USER = "root";
    private static final String PASS = "aashu";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }
}