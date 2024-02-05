import java.sql.*;
import java.util.*;

public class CreateTable
{
    public static void main(String[] args)
    {
        Connection cn=null;
        Statement stmt;
        int rno,age;
        String name,gender;

        Scanner s1=new Scanner(System.in);
		System.out.println("Enter roll no:");
		rno=s1.nextInt();
		System.out.println("Enter name:");
		name=s1.next();
		System.out.println("Enter age:");
		age=s1.nextInt();
        System.out.println("Enter Gender:");
		gender=s1.next();
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
            stmt=cn.createStatement();

            //stmt.executeUpdate("CREATE DATABASE student");

            //create table
            //stmt.executeUpdate("CREATE table student(rno int,name varchar(20),age int,gender varchar(20))");
            //insert values
            //stmt.executeUpdate("insert into student values(11,'dax',19,'male')");
            //String sql="insert into student values("+rno+",'"+name+"',"+age+",'"+gender+"')";
            //stmt.executeUpdate(sql);
            //System.out.println(sql);

            //update query
            //stmt.executeUpdate("UPDATE student SET rno=13,name='Mahipal',age=25,gender='M' WHERE rno=12;");
            // String sqlUp="UPDATE student SET name="+name+" where rno="+rno;
           // stmt.executeUpdate(sqlUp);
            // System.out.println(sqlUp);

            //Delete query
            //String sql="delete from student where rno="+rno;
            //stmt.executeUpdate(sql);
            //System.out.println(sql);

            //Display record
            ResultSet rs=stmt.executeQuery("Select * from student");
                System.out.println("===========================================");
                System.out.println("Roll no   Name     Age    Gender");
                System.out.println("===========================================");
            while(rs.next())
            {
                System.out.println(+rs.getInt(1)+"      |"+rs.getString(2)+"      |"+rs.getInt(3)+"     |"+rs.getString(4)+"    |");
            }
            
            cn.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}