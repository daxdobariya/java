import java.util.*;
class NestedTry
{
    public static void main(String args[])
    {
        int a[]=new int[5];
        int flag=0;
        try
        {
           System.out.println("value of 1st index is"+a[1]);
           System.out.println("value of 5st index is"+a[4]);
           System.out.println("value of 2nd index is"+a[2]);
        }
            try
            {
                int a=5,b=0;
                int c=a/b;
                System.out.println("Divisible by zero inside try");
            }
            catch(Exception e)
            {
                flag=1;
                System.out.println("e.getMessage()");
            }
            
        catch(ArithmeticException e)
        {
           flag=1;
           System.out.println("Arithmetic");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            flag=1;
            System.out.println("array");
        }
        catch(Exception e)
        {
            flag=1;
            System.out.println("e.getMessage()");
        }
        finally
        {
            System.out.println("Finally block");
        }
        if(flag==1)
            System.out.println("value of 1st index is"+a[4]);
            System.out.println("outside of catch");
        
    }
}