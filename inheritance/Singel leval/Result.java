import java.util.*;
class Result extends Student
{
    protected int ebs,ejava,edbms2;
    protected float etotal,per;
    void getdata()
    {
        super.getdata();
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter Marks");
        System.out.println("Enter MArk for BS:");
        ebs=s1.nextInt();
        System.out.println("Enter MArk for Java:");
        ejava=s1.nextInt();
        System.out.println("Enter MArk for DBMS:");
        edbms2=s1.nextInt();
    }
    void putdata()
    {
        super.putdata();
        System.out.println("BS         :"+ebs);
        System.out.println("Java       :"+ejava);
        System.out.println("DBMS       :"+edbms2);
        System.out.println("Total      :"+total);
        System.out.println("Percentage :"+per);
        
    }
    void calculate()
    {
        etotal=ebs+ejava+edbms2;
        per=etotal/3;
    }
}
