import java.util.*;
import java.io.*;

class List {

    List(String s) throws IOException
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
}