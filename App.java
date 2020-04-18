import java.io.*;

import java.util.*;



public class App implements Serializable {
    private static final String filename = null;
    HashSet<List> list = new HashSet<>();

    static List l;
    public static void main(String[] arg) throws IOException, ClassNotFoundException {

        String input = "";

        App app = new App();

        System.out.println("Enter");

        Scanner sc = new Scanner(System.in);

        

        while (!(input.equals("/exit"))) {

            input = sc.nextLine();

            final String command = app.getCommand(input);

            final String filename = app.getFile(input);

            // List list = new List();

            switch (command) {
                case "/list": {
                   // for(String s:list)
                    //System.out.println(list);
                    break;
                }
                case "/list create": {
                    app.createList(filename);
                    break;
                }
                case "/list delete": {
                    app.deleteList(filename);
                    break;
                }
                case "/list rename": {
                    try{
                    String on, nn, f;
                    f = app.getFile(input);

                    int i = f.indexOf(' ');
                    on = f.substring(0, i);
                    nn = f.substring(i + 1);
                    app.renameList(on, nn);
                    }
                    catch(StringIndexOutOfBoundsException e)
                    {
                        System.out.println("Sorry wrong usage!");
                    }
                    break;
                }

                case "/list open": {
                   app.openList(filename);
                    break;
                }
                case "/help": {
                    System.out.println("Lyadh Lagche Bro!");
                    break;
                }
                case "/exit": {
                    break;
                }

                case "/task add":{
                    l.addTask(filename);
                }

                default: {
                    System.out.println("Unknown command! use /help for more info");
                }

            }
        }
        sc.close();
    }

    String getCommand(String s) {
        
        if (s.equals("/list")) {
            return s;
        }
        
        else if (s.equals("/help")) {
            return "/help";
        } 
        
        else if (s.equals("/exit")) {
            return "/exit";
        } 
        
        else if (s.substring(0, 12).equals("/list create")) {
            return "/list create";
        } 
        
        else if (s.substring(0, 12).equals("/list delete")) {
            return "/list delete";
        } 
        
        else if (s.substring(0, 12).equals("/list rename")) {
            return "/list rename";
        } 
        
        else if (s.substring(0, 11).equals("/list open")) {
            return "/list open";
        }

        else if(s.substring(0, 10).equals("/task add"))
        {
            return "/task add";
        }
        else {
            return "";
        }
    }

    String getFile(String s) {

        if (s.equals("/help")) {
            return "";
        } 
        
        else if (s.equals("/exit")) {
            return "";
        } 
        
        else if (s.substring(0, 12).equals("/list create")) {
            System.out.println(s.substring(12));
            return s.substring(13);
        } 
        
        else if (s.substring(0, 12).equals("/list delete")) {
            return s.substring(13);
        } 
        
        else if (s.substring(0, 12).equals("/list rename")) {
            return s.substring(13);
        }
        
        else if(s.substring(0, 11).equals("/list open"))
        {
            return s.substring(12);
        }

        else if(s.substring(0, 10).equals("/task add"))
        {
            return s.substring(11);
        }
        
        else {
            return "";
        }
    }

    void createList(String file) throws IOException {
        // ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./List/"+f+".lst"));
        // List l =new List();
        // if (list.add(l)) {
        //     oos.writeObject(l);
        // }

        // else {
        //     System.out.println("Sorry list already exsists!");
        // }

        // oos.close();
        File f= new File("./List/"+file+".lst");
        if(f.createNewFile())
        {
            System.out.println("Added List "+f+" Successful!");
        }
        else
        {
            System.out.println("Sorry! list already exsist");
        }
    }

    void deleteList(String s) throws IOException
    {
        File f = new File("./List/"+s+".lst");
        if(f.delete())
        {
            System.out.println(s+" deleted Succesfuly");
        }
        else
        {
            System.out.println("Sorry! no such list exsists");
        }
    }
    void renameList(String on,String nn) throws IOException
    {
        File of= new File("./List/"+on+".lst");
        File nf= new File("./List/"+nn+".lst");
        if(of.renameTo(nf))
        {
            System.out.println("List renamed to "+nn+" Sucessfully!");
        }
        else
        {
            System.out.println("Sorry! no such list exsists");
        }
    }

    void openList(String f) throws ClassNotFoundException, IOException 
    {
        
        List t=new List(f);
         l=t;

    }

}