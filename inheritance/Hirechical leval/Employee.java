import java.util.*;

public class Employee 
{
    int eno,age;
    String nm;
    public void getdata()
    {
        Scanner s1=new Scanner(System.in);
        
        System.out.println("===========================");
        System.out.println("Enter Emp no");
        eno=s1.nextInt();
        System.out.println("Enter Name");
        nm=s1.next();
        System.out.println("Enter age");
        age=s1.nextInt();
    }
    void putdata()
    {
        System.out.println("Employee number is :"+eno);
        System.out.println("Employee NAme is   :"+nm);
        System.out.println("Employee age is    :"+age);
    }
    
}