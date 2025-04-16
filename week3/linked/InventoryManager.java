package week3.linked;

import java.util.Scanner;

class ItemNode {
    String itemName;
    int itemId;
    int quantity;
    double price;
    ItemNode next;

    public ItemNode(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class InventoryList {
    private ItemNode head = null;

    // Add item at beginning
    public void addAtBeginning(String name, int id, int qty, double price) {
        ItemNode newItem = new ItemNode(name, id, qty, price);
        newItem.next = head;
        head = newItem;
    }

    // Add item at end
    public void addAtEnd(String name, int id, int qty, double price) {
        ItemNode newItem = new ItemNode(name, id, qty, price);
        if (head == null) {
            head = newItem;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newItem;
    }

    // Add item at specific position (1-based)
    public void addAtPosition(String name, int id, int qty, double price, int pos) {
        if (pos <= 1 || head == null) {
            addAtBeginning(name, id, qty, price);
            return;
        }

        ItemNode newItem = new ItemNode(name, id, qty, price);
        ItemNode temp = head;
        int count = 1;

        while (temp.next != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }

        newItem.next = temp.next;
        temp.next = newItem;
    }

    // Remove item by ID
    public void removeById(int id) {
        if (head == null) return;

        if (head.itemId == id) {
            head = head.next;
            System.out.println("Item removed.");
            return;
        }

        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != id) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
            System.out.println("Item removed.");
        } else {
            System.out.println("Item ID not found.");
        }
    }

    // Update quantity by ID
    public void updateQuantity(int id, int newQty) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                System.out.println("Quantity updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item ID not found.");
    }

    // Search by ID or Name
    public void search(String query) {
        ItemNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (String.valueOf(temp.itemId).equals(query) || temp.itemName.equalsIgnoreCase(query)) {
                System.out.println("Found: " + temp.itemName + " | ID: " + temp.itemId + " | Qty: " + temp.quantity + " | Price: ₹" + temp.price);
                found = true;
            }
            temp = temp.next;
        }
        if (!found)
            System.out.println("Item not found.");
    }

    // Total inventory value
    public void totalValue() {
        double total = 0;
        ItemNode temp = head;
        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: ₹" + total);
    }

    // Sort based on Name or Price
    public void sort(String field, boolean ascending) {
        head = mergeSort(head, field, ascending);
    }

    private ItemNode mergeSort(ItemNode head, String field, boolean asc) {
        if (head == null || head.next == null)
            return head;

        ItemNode mid = getMiddle(head);
        ItemNode nextOfMid = mid.next;
        mid.next = null;

        ItemNode left = mergeSort(head, field, asc);
        ItemNode right = mergeSort(nextOfMid, field, asc);

        return sortedMerge(left, right, field, asc);
    }

    private ItemNode sortedMerge(ItemNode a, ItemNode b, String field, boolean asc) {
        if (a == null) return b;
        if (b == null) return a;

        ItemNode result;
        boolean condition;

        if (field.equalsIgnoreCase("name")) {
            condition = asc ? a.itemName.compareToIgnoreCase(b.itemName) <= 0 : a.itemName.compareToIgnoreCase(b.itemName) > 0;
        } else {
            condition = asc ? a.price <= b.price : a.price > b.price;
        }

        if (condition) {
            result = a;
            result.next = sortedMerge(a.next, b, field, asc);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next, field, asc);
        }

        return result;
    }

    private ItemNode getMiddle(ItemNode head) {
        if (head == null) return head;

        ItemNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Display items
    public void display() {
        ItemNode temp = head;
        while (temp != null) {
            System.out.println(temp.itemName + " | ID: " + temp.itemId + " | Qty: " + temp.quantity + " | Price: ₹" + temp.price);
            temp = temp.next;
        }
    }
}

public class InventoryManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InventoryList inventory = new InventoryList();

        inventory.addAtEnd("Pen", 101, 50, 5.0);
        inventory.addAtEnd("Notebook", 102, 20, 25.0);
        inventory.addAtBeginning("Marker", 103, 10, 15.0);
        inventory.addAtPosition("Pencil", 104, 30, 3.0, 2);

        System.out.println("Initial Inventory:");
        inventory.display();

        System.out.println("\nSearch Item (by ID or Name):");
        inventory.search("Notebook");

        System.out.println("\nUpdate Quantity of Item ID 102 to 100:");
        inventory.updateQuantity(102, 100);
        inventory.display();

        System.out.println("\nTotal Inventory Value:");
        inventory.totalValue();

        System.out.println("\nSorted by Name Ascending:");
        inventory.sort("name", true);
        inventory.display();

        System.out.println("\nSorted by Price Descending:");
        inventory.sort("price", false);
        inventory.display();

        System.out.println("\nRemove Item ID 103:");
        inventory.removeById(103);
        inventory.display();
    }
}
