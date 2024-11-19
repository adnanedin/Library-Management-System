
package project;
import java.sql.*;

/**
 * ConnectionProvider class to establish a connection to the MySQL database.
 */
public class ConnectionProvider {

    public static Connection getCon() {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms", "root", "Aliaskhan@03");
            
            return con;
        } catch (Exception e) {
            // Print the exception message
            System.out.println(e);
            return null;
        }
    }
    
    public static void main(String[] args) {
        // Test the connection
        Connection con = getCon();
        if (con != null) {
            System.out.println("Connection successful!");
        } else {
            System.out.println("Connection failed!");
        }
    }
}


