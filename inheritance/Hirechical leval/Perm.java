import java.util.*;
class Perm extends Employee
{
    float bsal, hra, da, pf, ns;

    public void getdata()
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter Basic Salary");
        bsal=s1.nextInt();
    }

    void calculate()
    {
        hra = 20 * bsal/100;
        da = 30 * bsal/100;
        pf = 80 * bsal/100;
        ns = bsal + hra + da - pf;
    }
    void putdata()
    {
        super.putdata();
        System.out.println("Net Salary: " + ns);
        
        
    }
}