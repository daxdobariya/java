import java.sql.*;
import java.util.*;

public class MenuDriven {
    public static void main(String args[]) {
        Connection cn = null;
        Statement stmt;
        int choice;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Menu Driven SQL Query");
            System.out.println("Enter the Choice:::");

            System.out.println("1.Insert values into student");
            System.out.println("2.Update values into student");
            System.out.println("3.Delete values into student");
            System.out.println("4.Display all records");
            System.out.println("0.Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    try {
                        int trno, tage;
                        String tname, tgender;

                        System.out.println("Enter the Rollno::");
                        trno = input.nextInt();

                        System.out.println("Enter the Name::");
                        tname = input.next();

                        System.out.println("Enter the Age::");
                        tage = input.nextInt();

                        System.out.println("Enter the Gender::");
                        tgender = input.next();

                        Class.forName("com.mysql.cj.jdbc.Driver");
                        cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
                        stmt = cn.createStatement();
                        stmt.executeUpdate("INSERT INTO student VALUES(" + trno + ",'" + tname + "'," + tage + ",'"
                                + tgender + "')");
                        System.out
                                .println("Values is inserted(" + trno + "," + tname + "," + tage + "," + tgender + ")");
                        cn.close();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                    break;
                case 2: {
                    try {
                        int trno;
                        String tgender;

                        System.out.println("Enter the Rollno::");
                        trno = input.nextInt();

                        System.out.println("Enter the Gender::");
                        tgender = input.next();

                        Class.forName("com.mysql.cj.jdbc.Driver");
                        cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
                        stmt = cn.createStatement();
                        /*
                         * UPDATE student SET gender='tgender' WHERE rno = trno
                         */
                        stmt.executeUpdate("UPDATE student SET gender = '" + tgender + "' WHERE rno = " + trno + "");
                        System.out.println("Values is updated of " + trno);
                        cn.close();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                    break;
                case 3: {
                    try {
                        int trno;

                        System.out.println("Enter the Rollno::");
                        trno = input.nextInt();

                        Class.forName("com.mysql.cj.jdbc.Driver");
                        cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
                        stmt = cn.createStatement();
                        /*
                         * DELETE * from student where rno = trno
                         */
                        stmt.executeUpdate("DELETE FROM student WHERE rno=" + trno + " ");
                        System.out.println("Value deleted of" + trno);
                        cn.close();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                    break;
                case 4: {
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
                        stmt = cn.createStatement();

                        ResultSet rs = stmt.executeQuery("select * from student");
                        while (rs.next()) {
                            System.out.println("--------- Record ---------");
                            System.out.println("Roll number::" + rs.getInt(1));
                            System.out.println("Name::" + rs.getString(2));
                            System.out.println("Age::" + rs.getInt(3));
                            System.out.println("Gender::" + rs.getString(4));
                        }
                        cn.close();
                        stmt.close();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                    break;
            }
        } while (choice != 0);
        input.close();
    }
}