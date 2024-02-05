class demo
{
    public static void main(String[] args) 
    {
        Perm p1=new Perm();
        Temp t1=new Temp();
        
        System.out.println("For Permenant Employee");
        p1.getdata();
        p1.calculate();
        p1.putdata();
        System.out.println("=======================");
        System.out.println("For Temporary Employee");
        t1.getdata();
        t1.calculate();
        t1.putdata();
    }
}