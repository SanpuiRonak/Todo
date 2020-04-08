
public class Task {

    private String task_name;
    private boolean status;

    Task(String s) {
        this.task_name = s;
        this.status = false;
    }

    void complete() {
        this.status = true;
    }

    void uncomplete() {
        this.status = false;
    }

    void rename(String s) {
        this.task_name = s;
    }

    boolean getStatus() {
        return status;
    }

}