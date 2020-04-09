import java.util.*;

public class App {
    private static final String filename = null;

    public static void main(String[] arg) {
        Map<Integer, List> m = new HashMap<>();
        String input = "";
        App ins = new App();
        System.out.println("Enter");
        Scanner sc = new Scanner(System.in);
        while(!(input.equals("/exit")))
        {
            input=sc.nextLine();
            final String command =ins.getCommand(input);
            final String filname = ins.getFile(input);
            switch(command)
            {
                case "/list":
                {
                    for(Integer key:m.keySet())
                    {
                        System.out.println(key);
                    }
                    break;
                }
                case "/list create":
                {
                    m.put(0, new List(filename));
                    System.out.println("Added list "+filname);
                }
            }
        }
        
        
        
    }
    String getCommand(String s)
    {
        if(s.equals("/list"))
        {
            return s;
        }
        else if(s.substring(0,12).equals("/list create"))
        {
            return "/list create";
        }
        else if(s.substring(0,12).equals("/list delete"))
        {
            return "/list delete";
        }
        else if(s.substring(0,13).equals("/list rename"))
        {
            return "/list rename";
        }
        else
        {
            return "";
        }
    }

    String getFile(String s)
    {
        // if(s.equals("/list"))
        // {
        //     command= 
        // }
       // else 
        if(s.substring(0,10).equals("/list add"))
        {
            return s.substring(10);
        }
        else if(s.substring(0,12).equals("/list delete"))
        {
            return s.substring(12);
        }
        else if(s.substring(0,13).equals("/list rename"))
        {
            return s.substring(13);
        }
        else
        {
            return "";
        }
    }
    
}