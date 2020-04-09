
public class App {
    public static void main(String[] arg) {
        Map<Integer, Task> m = new HashMap<>();
        String input = "";
        Tod
        
        
        
    }
    String getCommand(String s)
    {
        if(s.equals("/list"))
        {
            return s;
        }
        else if(s.substring(0,10).equals("/list add"))
        {
            return "/list add";
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