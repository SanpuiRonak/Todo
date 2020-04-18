
public class Task {

    private String task_name;
    private boolean status;
    private String description;
    private int index;

    Task(String s,int i) {
        this.task_name = s;
        this.status = false;
        this.description="";
        this.index=i;
    }

    void complete() {
        this.status = true;
    }

    void uncomplete() {
        this.status = false;
    }

    void rename(String new_name) {
        this.task_name = new_name;
    }

    boolean getStatus() {
        return this.status;
    }
    void setStatus(boolean status)
    {
        this.status=status;
    }

    void setDesc(String desc)
    {
        this.description=desc;
    }

    String getDesc()
    {
        return this.description;
    }


    void printTask()
    {
        System.out.print("["+this.index+"]"+this.task_name+": ");
        if(this.status)
        {
            System.out.print("Complete");
        }
        else
        {
            System.out.print("Incomplete");
        }
        System.out.println("-----");
        System.out.println(this.description);

    }

}