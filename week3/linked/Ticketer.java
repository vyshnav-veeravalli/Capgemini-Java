class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    Ticket next;

    public Ticket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class CircularTicketList {
    private Ticket head = null;
    private Ticket tail = null;

    // Add ticket at end
    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = tail = newTicket;
            newTicket.next = head;
        } else {
            tail.next = newTicket;
            tail = newTicket;
            tail.next = head;
        }
        System.out.println("Ticket added successfully.");
    }

    // Remove ticket by ID
    public void removeTicket(int ticketId) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        Ticket current = head;
        Ticket prev = tail;

        do {
            if (current.ticketId == ticketId) {
                if (current == head) {
                    if (head == tail) {
                        head = tail = null;
                    } else {
                        head = head.next;
                        tail.next = head;
                    }
                } else if (current == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = current.next;
                }
                System.out.println("Ticket ID " + ticketId + " removed.");
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        System.out.println("Ticket ID not found.");
    }

    // Display all tickets
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        Ticket temp = head;
        System.out.println("\nBooked Tickets:");
        do {
            System.out.println("ID: " + temp.ticketId + " | Name: " + temp.customerName + " | Movie: " + temp.movieName
                    + " | Seat: " + temp.seatNumber + " | Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by Customer Name or Movie Name
    public void search(String keyword) {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        boolean found = false;
        Ticket temp = head;
        do {
            if (temp.customerName.equalsIgnoreCase(keyword) || temp.movieName.equalsIgnoreCase(keyword)) {
                System.out.println("Found - Ticket ID: " + temp.ticketId + " | Name: " + temp.customerName +
                        " | Movie: " + temp.movieName + " | Seat: " + temp.seatNumber + " | Time: " + temp.bookingTime);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No matching ticket found.");
        }
    }

    // Count total tickets
    public void totalTickets() {
        if (head == null) {
            System.out.println("Total Booked Tickets: 0");
            return;
        }

        int count = 0;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Total Booked Tickets: " + count);
    }
}

public class Ticketer{
    public static void main(String[] args) {
        CircularTicketList system = new CircularTicketList();

        // Add sample tickets
        system.addTicket(101, "Alice", "Inception", "A1", "10:00 AM");
        system.addTicket(102, "Bob", "Interstellar", "B3", "12:30 PM");
        system.addTicket(103, "Charlie", "Inception", "A2", "10:00 AM");

        // Display all tickets
        system.displayTickets();

        // Search
        System.out.println("\nSearch by movie name 'Inception':");
        system.search("Inception");

        System.out.println("\nSearch by customer 'Bob':");
        system.search("Bob");

        // Remove ticket
        System.out.println("\nRemoving ticket ID 102...");
        system.removeTicket(102);

        // Display again
        system.displayTickets();

        // Count tickets
        system.totalTickets();
    }
}
