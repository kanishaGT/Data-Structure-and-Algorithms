// File: CircularLinkedListADT.java
public class CircularLinkedListADT {

    // Node class
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Constructor
    public CircularLinkedListADT() {
        head = null;
    }

    // 1️⃣ Traverse
    public void traverse() {
        if (head == null) return;

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    // 2️⃣ Insert at Beginning
    public void insertAtBeginning(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            newNode.next = head;
            current.next = newNode;
            head = newNode;
        }
    }

    // 3️⃣ Insert at End
    public void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }

    // 4️⃣ Delete First Node
    public void deleteFirst() {
        if (head == null) return;

        if (head.next == head) { // only one node
            head = null;
            return;
        }

        Node last = head;
        while (last.next != head) {
            last = last.next;
        }

        head = head.next;
        last.next = head;
    }

    // 5️⃣ Delete Last Node
    public void deleteLast() {
        if (head == null) return;

        if (head.next == head) { // only one node
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != head) {
            current = current.next;
        }

        current.next = head;
    }

    // 6️⃣ Search
    public int search(int key) {
        if (head == null) return -1;

        Node current = head;
        int index = 0;
        do {
            if (current.data == key) return index;
            current = current.next;
            index++;
        } while (current != head);

        return -1; // not found
    }

    // 7️⃣ Update
    public void update(int index, int newValue) {
        if (head == null || index < 0) {
            System.out.println("Invalid index");
            return;
        }

        Node current = head;
        int i = 0;
        do {
            if (i == index) {
                current.data = newValue;
                return;
            }
            current = current.next;
            i++;
        } while (current != head);

        System.out.println("Index out of bounds");
    }
}
