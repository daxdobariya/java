import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class write
{
    public static void main(String[] args)
    {
        File f1 = new File("1.txt");
        String content = "Hello Good Morning";
        try
        {
            FileOutputStream fos = new FileOutputStream(f1);
            fos.write(content.getBytes());
            System.out.println("Sucessfully");
            fos.close();
        }
        catch(IOException e)
        {
            System.out.println("Error Encounter");
        }
    }
}