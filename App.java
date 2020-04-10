import java.io.IOException;
import java.util.*;

public class App {
    private static final String filename = null;

    public static void main(String[] arg) throws IOException {
        
        
        String input = "";
        
        App ins = new App();
        
        System.out.println("Enter");
        
        Scanner sc = new Scanner(System.in);
        List task = new List();
        
        while (!(input.equals("/exit"))) {
        
            input = sc.nextLine();
        
            final String command = ins.getCommand(input);
        
            System.out.println(input.substring(13));
        
            final String filename = ins.getFile(input);

            List list = new List();
        
            switch (command) {
                case "/list": {
                    // for (Integer key : m.keySet()) {
                    //     System.out.println(key);
                    // }
                    break;
                }
                case "/list create": {
                    list.create(filename);
                    break;
                }
                case "/list delete":{
                    list.delete(filename);
                }
                case "/list rename":{
                    lis
                }

            }
        }

    }

    String getCommand(String s) {
        if (s.equals("/list")) {
            return s;
        } else if (s.substring(0, 12).equals("/list create")) {
            return "/list create";
        } else if (s.substring(0, 12).equals("/list delete")) {
            return "/list delete";
        } else if (s.substring(0, 13).equals("/list rename")) {
            return "/list rename";
        } else {
            return "";
        }
    }

    String getFile(String s) {

        if (s.substring(0, 12).equals("/list create")) {
            System.out.println(s.substring(12));
            return s.substring(13);
        } else if (s.substring(0, 12).equals("/list delete")) {
            return s.substring(13);
        } else if (s.substring(0, 13).equals("/list rename")) {
            return s.substring(14);
        } else {
            return "";
        }
    }

}