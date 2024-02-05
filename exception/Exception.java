import java.util.*;
class Exception
{
    public static void main(String args[])
    {
        int price;
        Scanner s1=new Scanner(System.in);
        try
        {
            System.out.println("Enter product details");
            price=s1.nextInt();

            if(price<1000)
                throw new Myerrordemo("price invalid");
        }
        catch(Myerrordemo e)
        {
        
            System.out.println(e.getMessage());
        }
    }
}