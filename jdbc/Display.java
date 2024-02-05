import java.sql.*;
import java.util.*;
public class Display 
{
    public static void main(String[] args)
    {
        try
        {
            Scanner s1=new Scanner(System.in);
            Connection cn = null;
            Statement stmt;
            int rno,age;
            String name,gender;

            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
            stmt = cn.createStatement();

            ResultSet rs=stmt.executeQuery("select * from student");
            while (rs.next()) {
                System.out.println("=================================");
                System.out.printf("Roll No : %-10d Name : %-15s\n", rs.getInt(1), rs.getString(2));
                System.out.printf("Age     : %-10d Gender : %-15s\n", rs.getInt(3), rs.getString(4));
                System.out.println("=================================");
            }
            
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }       
}
