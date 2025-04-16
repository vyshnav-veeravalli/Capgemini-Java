class TextState {
    String content;
    TextState prev, next;

    public TextState(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}

class TextEditor {
    private TextState head = null;
    private TextState tail = null;
    private TextState current = null;
    private int size = 0;
    private final int MAX_HISTORY = 10;

    // Add new state (typing or command)
    public void addState(String newText) {
        TextState newState = new TextState(newText);

        if (head == null) {
            head = tail = current = newState;
            size = 1;
        } else {
            // Remove forward history if any
            if (current != tail) {
                current.next = null;
                tail = current;
            }

            // Add new state
            tail.next = newState;
            newState.prev = tail;
            tail = newState;
            current = newState;
            size++;

            // Trim history if size > MAX_HISTORY
            if (size > MAX_HISTORY) {
                head = head.next;
                head.prev = null;
                size--;
            }
        }
        System.out.println("Text updated: " + newText);
    }

    // Undo functionality
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo performed.");
        } else {
            System.out.println("No more undo available.");
        }
    }

    // Redo functionality
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo performed.");
        } else {
            System.out.println("No more redo available.");
        }
    }

    // Display current text
    public void showCurrentState() {
        if (current != null) {
            System.out.println("Current Text: " + current.content);
        } else {
            System.out.println("No text available.");
        }
    }

    // Display all states (for debugging)
    public void displayAllStates() {
        TextState temp = head;
        System.out.println("\nAll Text States:");
        while (temp != null) {
            if (temp == current) {
                System.out.println("-> " + temp.content + " (current)");
            } else {
                System.out.println("   " + temp.content);
            }
            temp = temp.next;
        }
    }
}

public class Editor {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.showCurrentState();

        editor.undo();
        editor.showCurrentState();

        editor.undo();
        editor.showCurrentState();

        editor.redo();
        editor.showCurrentState();

        editor.addState("New Line");
        editor.showCurrentState();

        editor.redo(); // Should not work

        // Fill to exceed max history (10)
        for (int i = 1; i <= 10; i++) {
            editor.addState("Text " + i);
        }

        editor.displayAllStates(); // Only last 10 should remain
    }
}
