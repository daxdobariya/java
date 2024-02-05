import java.sql.*;
import java.util.*;

public class optionDB
{

	public static void main(String args[])
	{	
		Scanner s1=new Scanner(System.in);

		int rno,age,choice;
		String nm,gender;
		String up=null;

		do{
		System.out.println("1.Insert\n2.Update\n3.Delete\n4.EXIT");
		choice=s1.nextInt();
		

		switch(choice)
		{
			case 1:
			{
				System.out.println("roll number : ");
				rno=s1.nextInt();
		
				s1.nextLine();
		
				System.out.println("Name : ");
				nm=s1.nextLine();

		
				System.out.println("age : ");
				age=s1.nextInt();

				System.out.println("Gender : ");
				gender=s1.next();

				 up="insert into student values( " +rno+ " , '"+nm+"', "+age+" , '"+gender+"' )";
				break;
			}

			case 2:
			{
				System.out.println("roll number : ");
				rno=s1.nextInt();
		
				s1.nextLine();

				System.out.println("age : ");
				age=s1.nextInt();

				 up="UPDATE student set age="+age+" where rollno="+rno;
				break;
			}
			case 3:
			{
				System.out.println("Enter roll number of Student you want to delete: ");
				rno=s1.nextInt();

				 up="DELETE FROM student WHERE rollno="+rno;
			}
			
		}
		
		Connection cn=null;
		Statement stmt;

		
		try
		{
			
		Class.forName("com.mysql.cj.jdbc.Driver");
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
			stmt=cn.createStatement();
			stmt.executeUpdate(up);
			cn.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}while(choice!=4);
		
	}
}