// File: DoublyLinkedListADT.java
public class DoublyLinkedListADT {

    // Node class
    private class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;

    // Constructor
    public DoublyLinkedListADT() {
        head = null;
    }

    // 1️⃣ Traverse Forward
    public void traverseForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // 2️⃣ Traverse Backward
    public void traverseBackward() {
        if (head == null) return;

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    // 3️⃣ Insert at Beginning
    public void insertAtBeginning(int value) {
        Node newNode = new Node(value);
        if (head != null) {
            head.prev = newNode;
            newNode.next = head;
        }
        head = newNode;
    }

    // 4️⃣ Insert at End
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
        newNode.prev = current;
    }

    // 5️⃣ Insert at Position (0-based)
    public void insertAtPosition(int index, int value) {
        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            insertAtBeginning(value);
            return;
        }

        Node current = head;
        for (int i = 0; i < index - 1; i++) {
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

        Node newNode = new Node(value);
        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;
    }

    // 6️⃣ Delete First
    public void deleteFirst() {
        if (head == null) return;

        if (head.next != null) {
            head = head.next;
            head.prev = null;
        } else {
            head = null;
        }
    }

    // 7️⃣ Delete Last
    public void deleteLast() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.prev.next = null;
    }

    // 8️⃣ Delete at Position
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

        if (current.next != null) {
            current.next.prev = current.prev;
        }
        current.prev.next = current.next;
    }

    // 9️⃣ Search
    public int search(int key) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data == key) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    // 🔟 Update
    public void update(int index, int newValue) {
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
}
