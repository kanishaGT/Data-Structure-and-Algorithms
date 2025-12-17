
public class SinglyLinkedListADT {

    // Node class
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // Head of the list

    // Constructor
    public SinglyLinkedListADT() {
        head = null;
    }

    // 1️⃣ Traverse
    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // 2️⃣ Insert at beginning
    public void insertAtBeginning(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    // 3️⃣ Insert at end
    public void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // 4️⃣ Insert at position (0-based)
    public void insertAtPosition(int index, int value) {
        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            insertAtBeginning(value);
            return;
        }
        Node newNode = new Node(value);
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null) {
                System.out.println("Index out of bounds");
                return;
            }
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // 5️⃣ Delete first node
    public void deleteFirst() {
        if (head == null) return;
        head = head.next;
    }

    // 6️⃣ Delete last node
    public void deleteLast() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // 7️⃣ Delete at position (0-based)
    public void deleteAtPosition(int index) {
        if (head == null || index < 0) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            deleteFirst();
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current.next == null) {
                System.out.println("Index out of bounds");
                return;
            }
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Index out of bounds");
            return;
        }
        current.next = current.next.next;
    }

    // 8️⃣ Search
    public int search(int key) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data == key) return index;
            current = current.next;
            index++;
        }
        return -1; // Not found
    }

    // 9️⃣ Update
    public void update(int index, int newValue) {
        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            if (current == null) {
                System.out.println("Index out of bounds");
                return;
            }
            current = current.next;
        }
        if (current == null) {
            System.out.println("Index out of bounds");
            return;
        }
        current.data = newValue;
    }

    // 10️⃣ Get value at index
    public int get(int index) {
        if (index < 0) {
            System.out.println("Invalid index");
            return -1;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            if (current == null) {
                System.out.println("Index out of bounds");
                return -1;
            }
            current = current.next;
        }
        if (current == null) {
            System.out.println("Index out of bounds");
            return -1;
        }
        return current.data;
    }
}
