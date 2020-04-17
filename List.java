import java.io.*;
import java.util.ArrayList;

class List implements Serializable{

   // private Array task = new Array[10];
    private int x;
    
    List(int x)
    {
        this.x=x;
    }
    void create(String f)throws IOException
    {
        
        // File f = new File(".\\List\\"+s+".txt");
        // if(f.createNewFile())
        // {
        //     System.out.println("Added list "+s);
        // }
        // else
        // {
        //     System.out.println("List already Exsists!");
        // }
        
        ObjectOutputStream  oos= new ObjectOutputStream(new FileOutputStream("D:\\To-do\\List\\f.txt"));
        
    }

    void delete(String s) throws IOException
    {
        File f = new File(".\\List\\"+s+".txt");
        if(f.delete())
        {
            System.out.println(s+" deleted Succesfuly");
        }
        else
        {
            System.out.println("Sorry no such list exsists!");
        }
    }

    void rename(String on,String nn) throws IOException
    {
        File of= new File(".\\List\\"+on+".txt");
        File nf= new File(".\\List\\"+nn+".txt");
        if(of.renameTo(nf))
        {
            System.out.println("List renamed to "+nn+" Sucessfully!");
        }
        else
        {
            System.out.println("Sorry! no such list exsists");
        }
    }

    void open(String file)
    {
        File f= new File(".\\List"+file+".txt");

    }
}