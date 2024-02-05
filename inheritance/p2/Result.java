package p2;
import p1.*;
import java.util.*;
class Result extends Student implements exam_mks
{
    int bs,java,dbms2;
    float per,total;
    public void getmks()
    {
            super.getdata();
            Scanner s1=new Scanner(System.in);
            System.out.println("Enter Marks");
            System.out.println("Enter MArk for BS:");
            bs=s1.nextInt();
            System.out.println("Enter MArk for Java:");
            java=s1.nextInt();
            System.out.println("Enter MArk for DBMS:");
            dbms2=s1.nextInt();
       
    }
    void putdata()
    {
        super.putdata();
        System.out.println("BS         :"+bs);
        System.out.println("Java       :"+java);
        System.out.println("DBMS       :"+dbms2);
        System.out.println("Total      :"+total);
        System.out.println("Percentage :"+per);
        
    }
    void calculate()
    {
        total=bs+java+dbms2;
        per=total/3;
    }
}
