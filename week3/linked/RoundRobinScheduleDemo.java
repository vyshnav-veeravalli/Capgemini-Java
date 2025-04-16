class Process {
    int pid;
    int burstTime;
    int remainingTime;
    int priority;
    int waitingTime = 0;
    int turnaroundTime = 0;
    Process next;

    public Process(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
    }
}

class RoundRobinScheduler {
    private Process head = null;
    private Process tail = null;

    // Add process at the end
    public void addProcess(int pid, int burstTime, int priority) {
        Process newProcess = new Process(pid, burstTime, priority);
        if (head == null) {
            head = tail = newProcess;
            newProcess.next = head;
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head;
        }
    }

    // Remove process by ID
    public void removeProcess(int pid) {
        if (head == null) return;

        Process current = head;
        Process prev = tail;

        do {
            if (current.pid == pid) {
                if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }

    // Display process queue
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes.");
            return;
        }

        Process temp = head;
        System.out.println("Current Process Queue:");
        do {
            System.out.println("PID: " + temp.pid + " | Remaining: " + temp.remainingTime + " | Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }

    // Round-robin execution
    public void execute(int timeQuantum) {
        if (head == null) return;

        int currentTime = 0;
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;
        int processCount = 0;

        // Count initial processes
        Process countPointer = head;
        do {
            processCount++;
            countPointer = countPointer.next;
        } while (countPointer != head);

        Process current = head;

        System.out.println("\nStarting Round-Robin Execution (Time Quantum: " + timeQuantum + ")");
        while (head != null) {
            if (current.remainingTime > 0) {
                int execTime = Math.min(timeQuantum, current.remainingTime);
                System.out.println("Process " + current.pid + " executing for " + execTime + " units");
                current.remainingTime -= execTime;
                currentTime += execTime;

                if (current.remainingTime == 0) {
                    current.turnaroundTime = currentTime;
                    current.waitingTime = current.turnaroundTime - current.burstTime;
                    totalWaitingTime += current.waitingTime;
                    totalTurnaroundTime += current.turnaroundTime;

                    System.out.println("Process " + current.pid + " completed | TAT: " + current.turnaroundTime + ", WT: " + current.waitingTime);
                    int pidToRemove = current.pid;
                    current = current.next;
                    removeProcess(pidToRemove);

                    if (head == null) break; // All done
                } else {
                    current = current.next;
                }

                displayProcesses();
            }
        }

        System.out.println("\nAll processes executed.");
        System.out.printf("Average Waiting Time: %.2f\n", totalWaitingTime * 1.0 / processCount);
        System.out.printf("Average Turnaround Time: %.2f\n", totalTurnaroundTime * 1.0 / processCount);
    }
}

public class RoundRobinScheduleDemo {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler();

        scheduler.addProcess(1, 10, 2);
        scheduler.addProcess(2, 5, 1);
        scheduler.addProcess(3, 8, 3);

        System.out.println("Initial Process List:");
        scheduler.displayProcesses();

        scheduler.execute(4); // Set time quantum to 4 units
    }
}
