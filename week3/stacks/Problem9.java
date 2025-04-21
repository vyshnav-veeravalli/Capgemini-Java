package week3.stacks;

class MyHashMap {
    private static class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private static final int SIZE = 1000;
    private Node[] table;

    public MyHashMap() {
        table = new Node[SIZE];
    }

    private int hash(int key) {
        return key % SIZE;
    }

    // ✅ PUT Operation
    public void put(int key, int value) {
        int index = hash(key);

        // If no collision, place it directly
        if (table[index] == null) {
            table[index] = new Node(key, value);
            return;
        }

        // Collision - traverse list
        Node curr = table[index];
        while (true) {
            if (curr.key == key) {
                curr.value = value;  // Update existing
                return;
            }
            if (curr.next == null) break;
            curr = curr.next;
        }

        // Append at end
        curr.next = new Node(key, value);
    }

    // ✅ GET Operation
    public int get(int key) {
        int index = hash(key);
        Node curr = table[index];

        while (curr != null) {
            if (curr.key == key) return curr.value;
            curr = curr.next;
        }

        return -1; // Not found
    }

    // ✅ REMOVE Operation
    public void remove(int key) {
        int index = hash(key);
        Node curr = table[index];
        Node prev = null;

        while (curr != null) {
            if (curr.key == key) {
                if (prev == null) {
                    table[index] = curr.next;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }
}
class Main {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();

        map.put(1, 10);
        map.put(2, 20);
        System.out.println("Value for key 1: " + map.get(1)); // 10

        map.put(1, 15); // update
        System.out.println("Updated value for key 1: " + map.get(1)); // 15

        map.remove(2);
        System.out.println("Value for key 2: " + map.get(2)); // -1
    }
}

