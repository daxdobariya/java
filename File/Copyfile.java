import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
class Copyfile
{
    public static void main(String[] args)throws IOException
    {
        FileInputStream f1= null;
        FileOutputStream f2= null;
        int c;
        try
        {
            f1=new FileInputStream("1.txt");
            f2=new FileOutputStream("2.txt");
            while((c=f1.read()) != -1)
            {
                f2.write(c);
                System.out.print((char)c);
            }
            System.out.println("Copied the file successfully");
        }
        finally
        {
            if(f1 !=null)
            f1.close();
            if(f2 !=null)
            f2.close();
        }
    }
}