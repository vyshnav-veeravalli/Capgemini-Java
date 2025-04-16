package week3.linked;

class Task {
    int id;
    String name;
    int priority;
    String due;
    Task next;

    Task(int id, String name, int priority, String due) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.due = due;
        this.next = null;
    }
}

class CircularTask {
    private Task head = null;
    private Task tail = null;
    private Task current = null;

    public void start(int id, String name, int priority, String due) {
        Task newTask = new Task(id, name, priority, due);
        if (head == null) {
            head = tail = newTask;
            tail.next = head;
        } else {
            newTask.next = head;
            head = newTask;
            tail.next = head;
        }
    }

    public void end(int id, String name, int priority, String due) {
        Task newTask = new Task(id, name, priority, due);
        if (head == null) {
            head = tail = newTask;
            tail.next = head;
        } else {
            tail.next = newTask;
            tail = newTask;
            tail.next = head;
        }
    }

    public void pos(int id, String name, int priority, String due, int pos) {
        if (pos <= 1) {
            start(id, name, priority, due);
            return;
        }

        Task newTask = new Task(id, name, priority, due);
        Task temp = head;
        int count = 1;

        while (count < pos - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }

        newTask.next = temp.next;
        temp.next = newTask;

        if (temp == tail) {
            tail = newTask;
        }
    }

    public void remove(int id) {
        if (head == null) {
            return;
        }

        Task current = head;
        Task prev = tail;

        do {
            if (current.id == id) {
                if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = current.next;
                }

                if (this.current == current) {
                    this.current = current.next;
                }

                System.out.println("Task ID " + id + " removed.");
                return;
            }

            prev = current;
            current = current.next;
        } while (current != head);

        System.out.println("Task ID not found.");
    }

    public void displayCurrent() {
        if (current == null) {
            current = head;
        }

        if (current != null) {
            System.out.println("Current Task => ID: " + current.id + ", Name: " + current.name + ", Priority: " + current.priority + ", Due: " + current.due);
            current = current.next;
        } else {
            System.out.println("No task available.");
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("No task to display.");
            return;
        }

        Task temp = head;
        do {
            System.out.println("Task => ID: " + temp.id + ", Name: " + temp.name + ", Priority: " + temp.priority + ", Due: " + temp.due);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No task available.");
            return;
        }

        Task temp = head;
        boolean found = false;
        do {
            if (temp.priority == priority) {
                System.out.println("ID: " + temp.id + ", Name: " + temp.name + ", Due: " + temp.due);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No task found with priority " + priority);
        }
    }
}

public class CircularTasks {
    public static void main(String[] args) {
        CircularTask obj = new CircularTask();

        obj.start(1, "Gym", 7, "2025-04-20");
        obj.start(4, "Home", 1, "2025-04-22");
        obj.pos(5, "Call", 5, "2025-04-21", 2);
        obj.end(7, "Test", 3, "2025-04-23");
        obj.start(2, "Node", 8, "2025-04-19");
        obj.start(6, "CGPA", 9, "2025-04-24");

        System.out.println("\nAll Tasks:");
        obj.display();

        System.out.println("\nSearch Priority 5:");
        obj.searchByPriority(5);

        System.out.println("\nCurrent Task View:");
        obj.displayCurrent();
        obj.displayCurrent();

        System.out.println("\nRemove Task ID 4:");
        obj.remove(4);

        System.out.println("\nAll Tasks After Removal:");
        obj.display();
    }
}
