import java.sql.*;
import java.util.*;

public class Update 
{
    public static void main(String[] args) 
    {
        try 
        {
            Connection cn = null;
            Statement stmt;
            int rno, age;

            Scanner s1 = new Scanner(System.in);
            System.out.print("Enter Rno which to change:");
            rno = s1.nextInt();
            System.out.print("Enter New Age:");
            age = s1.nextInt();

            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
            stmt = cn.createStatement();

            String sql = "update student set age=" + age + " where rno=" + rno;
            stmt.executeUpdate(sql);
            
            System.out.println("Update successful!");
            
            cn.close();
            stmt.close();
        }
         catch (Exception e) 
         {
            System.out.println(e);
         }
    }
}
