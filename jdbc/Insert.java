import java.sql.*;
import java.util.*;
public class Insert
{
    public static void main(String[] args)
    {
        Connection cn = null;
        Statement stmt;
        int rno,age;
        String name,gender;

        Scanner s1=new Scanner(System.in);
        System.out.print("Roll no:");
        rno=s1.nextInt();
        System.out.print("Name:");
        name=s1.next();
        System.out.print("Age:");
        age=s1.nextInt();
        System.out.print("Gender:");
        gender=s1.next();
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
            stmt = cn.createStatement();
            // stmt.executeUpdate("insert into student values(17,'Chintan',18,'Male')");
            String sql = "insert into student values("+rno+",'"+name+"',"+age+",'"+gender+"')";
            stmt.executeUpdate(sql);
            cn.close();
        }    
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}