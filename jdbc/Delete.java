import java.sql.*;
import java.util.*;
public class Delete 
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

            
            System.out.print("Enter Rno which you want to delete:");
            rno=s1.nextInt();
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
            stmt = cn.createStatement();

            String sql="delete from student where rno="+rno;
            stmt.executeUpdate(sql);
            cn.close();
            stmt.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }    
}
