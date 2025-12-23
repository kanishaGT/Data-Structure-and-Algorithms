// File: LinkedListQueueADT.java
public class LinkedListQueueADT {

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front;
    private Node rear;
    private int size;

    public LinkedListQueueADT() {
        front = rear = null;
        size = 0;
    }

    // 1️⃣ Enqueue
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // 2️⃣ Dequeue
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int val = front.data;
        front = front.next;
        if (front == null) rear = null;
        size--;
        return val;
    }

    // 3️⃣ Peek
    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    // 4️⃣ isEmpty
    public boolean isEmpty() {
        return front == null;
    }

    // 5️⃣ Size
    public int size() {
        return size;
    }

    // 6️⃣ Display
    public void display() {
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
