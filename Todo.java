import java.util.*;

class Todo {
    public static void main(String[] arg) {
        // Map<Integer, Task> m = new HashMap<>();
        // String s = "Heloo";
        // m.put(0, new Task("Heloo"));
        // System.out.println(m.get(0).getStatus());
         Task arr[] = new Task[10000];
        // arr[0] =new Task("Hel0o");
        Task f = new Task("f");
         arr[0]=f;

        int i;
    }

    class Task {
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
}