import java.util.*;
import java.sql.*;

class SwitchCreateTable {
    public static void main(String args[]) {
        int ch;
        Connection cn = null;
        Statement stmt = null;
        int rno, age;
        String name, gender;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
            stmt = cn.createStatement();

            Scanner s1 = new Scanner(System.in)

            while (true) {
                System.out.println("1. Create database\n2. Create table\n3. Insert data\n4. Delete data\n5. Update data\n6. Display\n7. Exit");
                System.out.println("Enter your choice:");

                ch = s1.nextInt();

                switch (ch) {
                    case 1:
                        stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS student");
                        System.out.println("Database created successfully.");
                        break;

                    case 2:
                        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS student(rno INT, name VARCHAR(20), age INT, gender VARCHAR(20))");
                        System.out.println("Table created successfully.");
                        break;

                    case 3:
                        System.out.println("Enter roll no:");
                        rno = s1.nextInt();
                        System.out.println("Enter name:");
                        name = s1.next();
                        System.out.println("Enter age:");
                        age = s1.nextInt();
                        System.out.println("Enter Gender:");
                        gender = s1.next();

                        String sqlInsert = "INSERT INTO student VALUES(" + rno + ",'" + name + "'," + age + ",'" + gender + "')";
                        stmt.executeUpdate(sqlInsert);
                        System.out.println("Data inserted successfully.");
                        break;

                    case 4:
                        System.out.println("Enter roll no to delete:");
                        int rollToDelete = s1.nextInt();
                        String sqlDelete = "DELETE FROM student WHERE rno=" + rollToDelete;
                        stmt.executeUpdate(sqlDelete);
                        System.out.println("Data deleted successfully.");
                        break;

                    case 5:
                        System.out.println("Enter roll no to update:");
                        int rollToUpdate = s1.nextInt();

                        System.out.println("Enter new name:");
                        name = s1.next();
                        System.out.println("Enter new age:");
                        age = s1.nextInt();
                        System.out.println("Enter new gender:");
                        gender = s1.next();

                        String sqlUpdate = "UPDATE student SET name='" + name + "', age=" + age + ", gender='" + gender + "' WHERE rno=" + rollToUpdate;
                        stmt.executeUpdate(sqlUpdate);
                        System.out.println("Data updated successfully.");
                        break;

                    case 6:
                        ResultSet rs = stmt.executeQuery("SELECT * FROM student");
                        System.out.println("===========================================");
                        System.out.println("Roll no   Name     Age    Gender");
                        System.out.println("===========================================");
                        while (rs.next()) {
                            System.out.println(rs.getInt(1) + "      |" + rs.getString(2) + "      |" + rs.getInt(3) + "     |" + rs.getString(4) + "    |");
                        }
                        break;

                    case 7:
                        System.out.println("Exiting program. Goodbye!");
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (cn != null) cn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
