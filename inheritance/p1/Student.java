package p1;
import p2.*;
import java.util.*;
class Student
{
    protected int rno,age;
    protected String nm;
    void getdata()
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter Student Details");
        System.out.println("Enter Roll NO:");
        rno=s1.nextInt();
        System.out.println("Enter Name:");
        nm=s1.next();
        System.out.println("Enter Age:");
        age=s1.nextInt();
    }
    void putdata()
    {
        System.out.println("Roll Number"+rno);
        System.out.println("Name"+nm);
        System.out.println("Age"+age);
    }
    
}