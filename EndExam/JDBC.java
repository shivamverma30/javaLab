/*write a jdbc program to perform following opertaion 
a __ create a product table with coulm pid,pname,price,quantity.
b . insert multiple product information 
c. display all product information 
d. display all product information where product name dtsrt with 'p' & price more than 5000 */


//javac -cp ".;mysql-connector-j-9.5.0.jar" JDBC.java
//java "-cp" ".;mysql-connector-j-9.5.0.jar" JDBC



import java.sql.*;
import java.util.*;

class JDBC{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/endexam"; 
        String user = "root";  
        String pass = ""; 

        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            // a) Create table
            String createTable = "CREATE TABLE IF NOT EXISTS product("
                               + "pid INT PRIMARY KEY AUTO_INCREMENT, "
                               + "pname VARCHAR(50), "
                               + "price DOUBLE, "
                               + "quantity INT)";
            st.executeUpdate(createTable);
            System.out.println("Table created successfully!");

            // b) Insert multiple records
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO product(pname, price, quantity) VALUES (?, ?, ?)"
            );

            Scanner sc = new Scanner(System.in);
            System.out.print("How many products to insert? ");
            int n = sc.nextInt();
            sc.nextLine(); 

            for (int i = 0; i < n; i++) {
                System.out.print("Enter Product Name: ");
                String pname = sc.nextLine();
                System.out.print("Enter Price: ");
                double price = sc.nextDouble();
                System.out.print("Enter Quantity: ");
                int qty = sc.nextInt();
                sc.nextLine(); 

                ps.setString(1, pname);
                ps.setDouble(2, price);
                ps.setInt(3, qty);
                ps.executeUpdate();
            }
            System.out.println("Products inserted successfully!");

            // c) Display all product information
            System.out.println("\nAll Products:");
            ResultSet rs = st.executeQuery("SELECT * FROM product");
            while (rs.next()) {
                System.out.println(rs.getInt("pid") + " | " +
                                   rs.getString("pname") + " | " +
                                   rs.getDouble("price") + " | " +
                                   rs.getInt("quantity"));
            }

            // d) Display product where name starts with 'p' and price > 5000
            System.out.println("\nProducts starting with 'p' and price > 5000:");
            rs = st.executeQuery("SELECT * FROM product WHERE pname LIKE 'p%' AND price > 5000");
            while (rs.next()) {
                System.out.println(rs.getInt("pid") + " | " +
                                   rs.getString("pname") + " | " +
                                   rs.getDouble("price") + " | " +
                                   rs.getInt("quantity"));
            }

            con.close();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
