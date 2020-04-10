import java.util.*;
import java.io.*;

class List {

    void create(String s) throws IOException
    {
        File f = new File(".\\List\\"+s+".txt");
        if(f.createNewFile())
        {
            System.out.println("Added list "+s);
        }
        else
        {
            System.out.println("List already Exsists!");
        }
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
}