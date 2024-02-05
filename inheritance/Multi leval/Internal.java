import java.util.*;
class Internal extends Student
{
    protected int ibs,ijava,idbms2;
    protected float itotal;
    void getdata()
    {
        super.getdata();
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter Marks");
        System.out.println("Enter MArk for BS:");
        ibs=s1.nextInt();
        System.out.println("Enter MArk for Java:");
        ijava=s1.nextInt();
        System.out.println("Enter MArk for DBMS:");
        idbms2=s1.nextInt();
    }
    void putdata()
    {
        super.putdata();
        System.out.println("BS         :"+ibs);
        System.out.println("Java       :"+ijava);
        System.out.println("DBMS       :"+idbms2);
        System.out.println("Total      :"+itotal);
        
        
    }
    void calculate()
    {
        itotal=ibs+ijava+idbms2;
     
    }
}
