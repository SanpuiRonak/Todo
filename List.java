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
            System.out.println("Sorry no such file Exsists!");
        }
    }

    void 
}