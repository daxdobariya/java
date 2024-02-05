import java.io.*;
class read
{
    public static void main(String[] args)
    {
        File f1 = new File("1.txt");
        try
        {
            FileInputStream f2 = new FileInputStream(f1);
            int ch;

            while((ch = f2.read()) != -1)
            {
                System.out.print((char)ch);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error Encounter");
        }
    }
}