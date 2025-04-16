class BookNode {
    String title;
    String author;
    String genre;
    int bookId;
    boolean isAvailable;
    BookNode next;
    BookNode prev;

    public BookNode(String title, String author, String genre, int bookId, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}

class Library {
    private BookNode head = null;
    private BookNode tail = null;

    // Add book at the beginning
    public void addAtBeginning(String title, String author, String genre, int id, boolean available) {
        BookNode newBook = new BookNode(title, author, genre, id, available);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
    }

    // Add book at the end
    public void addAtEnd(String title, String author, String genre, int id, boolean available) {
        BookNode newBook = new BookNode(title, author, genre, id, available);
        if (head == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    // Add book at specific position (1-based)
    public void addAtPosition(String title, String author, String genre, int id, boolean available, int pos) {
        if (pos <= 1 || head == null) {
            addAtBeginning(title, author, genre, id, available);
            return;
        }

        BookNode newBook = new BookNode(title, author, genre, id, available);
        BookNode temp = head;
        int count = 1;

        while (temp.next != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }

        newBook.next = temp.next;
        newBook.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newBook;
        } else {
            tail = newBook;
        }
        temp.next = newBook;
    }

    // Remove a book by Book ID
    public void removeById(int bookId) {
        if (head == null) return;

        BookNode temp = head;
        while (temp != null && temp.bookId != bookId) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Book ID not found.");
            return;
        }

        if (temp == head) {
            head = head.next;
            if (head != null) head.prev = null;
        } else if (temp == tail) {
            tail = tail.prev;
            if (tail != null) tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        System.out.println("Book removed successfully.");
    }

    // Search by Title or Author
    public void search(String query) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(query) || temp.author.equalsIgnoreCase(query)) {
                printBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) System.out.println("Book not found.");
    }

    // Update availability status
    public void updateAvailability(int bookId, boolean newStatus) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = newStatus;
                System.out.println("Availability updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book ID not found.");
    }

    // Display forward
    public void displayForward() {
        BookNode temp = head;
        while (temp != null) {
            printBook(temp);
            temp = temp.next;
        }
    }

    // Display reverse
    public void displayReverse() {
        BookNode temp = tail;
        while (temp != null) {
            printBook(temp);
            temp = temp.prev;
        }
    }

    // Count total books
    public void countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total number of books: " + count);
    }

    // Helper
    private void printBook(BookNode book) {
        System.out.println("[" + book.bookId + "] " + book.title + " | " + book.author + " | " + book.genre +
                " | " + (book.isAvailable ? "Available" : "Not Available"));
    }
}

public class LibraryManger {
    public static void main(String[] args) {
        Library library = new Library();

        library.addAtEnd("The Hobbit", "J.R.R. Tolkien", "Fantasy", 101, true);
        library.addAtBeginning("1984", "George Orwell", "Dystopian", 102, true);
        library.addAtPosition("To Kill a Mockingbird", "Harper Lee", "Fiction", 103, true, 2);
        library.addAtEnd("Sapiens", "Yuval Noah Harari", "History", 104, false);

        System.out.println("Library Books (Forward):");
        library.displayForward();

        System.out.println("\nLibrary Books (Reverse):");
        library.displayReverse();

        System.out.println("\nSearch for 'Harper Lee':");
        library.search("Harper Lee");

        System.out.println("\nUpdate Availability of Book ID 104:");
        library.updateAvailability(104, true);
        library.displayForward();

        System.out.println("\nRemove Book ID 102:");
        library.removeById(102);
        library.displayForward();

        System.out.println("\nTotal Book Count:");
        library.countBooks();
    }
}
