import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

class List implements Serializable{

    ArrayList <Task> tasks=new ArrayList<>();
    void addTask(String f)throws IOException
    {
        int i=tasks.size()-1;
        
       tasks.add(new Task(f,i));
       this.printList();
           
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
     List(String file)throws IOException, ClassNotFoundException
    {
        File f=new File("./List"+file+".lst");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        List tmp=(List)(ois.readObject());
        tmp.printList();   
    }

    void printList()
    {
        for(int i=0;i<this.tasks.size();i++)
        {
            tasks.get(i).printTask();
        }
    }
}