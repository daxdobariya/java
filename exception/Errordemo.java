class Errordemo
{
    public static void main(String args[])
    {
        int a=10,b=50,c=5;
        int x,y;
        try
        {
            System.out.println("Executed");
            x=a/(b-c);
            System.out.println("Not Executed");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by Zero");
        }
            y=a/(b+c);
            System.out.println("Y="+y);
        
    }
}