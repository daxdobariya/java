import java.io.File;

import javafx.stage.StageStyle;

import java.io.File;
public class Pathnames 
{
  public static void main(String[] args) 
  {
    String[]Pathnames;
    File f= new File("Z:/Dax/sem4/JAVA/programs/File");
    Pathnames=f.list();  
    for(String pathname:Pathnames)
    {
        System.out.println(pathname);
    }    
  }    
}