/*Q46. Write a JDBC program to connect with MySQL database and create a table students(id, name, marks).
 Q47. Insert 5 records into the students table using JDBC PreparedStatement.
 Q48. Retrieve and display all student records where marks > 80.
 Q49. Update the name and marks of a student with a specific ID using JDBC.
 Q50. Delete a student record from the table using user input via JDBC and show proper exception handling. */

import java.sql.*;
import java.util.Scanner;

class JDBC {
    public static void main(String[] args) {
        String url  = "jdbc:mysql://localhost:3306/schooldb";

        String user = "root";
        String pass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // load driver once

            try (Connection con = DriverManager.getConnection(url, user, pass);
                 Scanner sc = new Scanner(System.in)) {

                System.out.println("Connected!");

                Statement st = con.createStatement();
                st.execute("CREATE TABLE IF NOT EXISTS students(id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(50), marks INT)");
                System.out.println("Table created.");

                PreparedStatement ps = con.prepareStatement("INSERT INTO students(name, marks) VALUES(?, ?)");
                String[][] data = {{"Amit","70"},{"Neha","85"},{"Ravi","90"},{"Pooja","60"},{"Raj","95"}};
                for (String[] d : data) {
                    ps.setString(1, d[0]);
                    ps.setInt(2, Integer.parseInt(d[1]));
                    ps.executeUpdate();
                }
                System.out.println("5 Records inserted.");

                ResultSet rs = st.executeQuery("SELECT * FROM students WHERE marks > 80");
                System.out.println("Students with marks > 80:");
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
                }

                System.out.print("Enter ID to update: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter new name: ");
                String name = sc.nextLine();
                System.out.print("Enter new marks: ");
                int marks = sc.nextInt();
                ps = con.prepareStatement("UPDATE students SET name=?, marks=? WHERE id=?");
                ps.setString(1, name);
                ps.setInt(2, marks);
                ps.setInt(3, id);
                ps.executeUpdate();
                System.out.println("Record updated.");

                System.out.print("Enter ID to delete: ");
                int del = sc.nextInt();
                ps = con.prepareStatement("DELETE FROM students WHERE id=?");
                ps.setInt(1, del);
                ps.executeUpdate();
                System.out.println("Record deleted.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
