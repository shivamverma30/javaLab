import java.sql.*;

public class a52 {
    public static void main(String[] args) {
        Connection con = null;

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully!");

            // Wrong database or credentials to simulate error
            String url = "jdbc:mysql://localhost:3306/fakeDB"; // wrong DB name
            String user = "root";
            String pass = "wrongpass"; // intentionally wrong

            // Try connecting
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected successfully!"); // will not execute

        } 
        catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found!");
            System.out.println("Tip: Add MySQL connector JAR to your classpath.");
        } 
        catch (SQLException e) {
            System.out.println("Database connection failed!");
            System.out.println("Reason: " + e.getMessage());
            System.out.println("SQL State: " + e.getSQLState());
            System.out.println("Error Code: " + e.getErrorCode());
            System.out.println("Tip: Check database name, username, or password.");
        } 
        finally {
            try {
                if (con != null) con.close();
                System.out.println("Connection closed.");
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }
    }
}
