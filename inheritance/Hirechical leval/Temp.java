import java.util.*;
class Temp extends Employee
{
    double whr,ns;
    final double hrs=250;

    public void getdata()
    {
        super.getdata();
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter Working Hour");
        whr=s1.nextDouble();
    }

    void calculate()
    {
        
        ns =whr*hrs;
    }
    void putdata()
    {
        super.putdata();
        System.out.println("Net Salary: " + ns);
        
    }
}