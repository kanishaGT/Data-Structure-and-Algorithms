// File: LinkedListStackADT.java
public class LinkedListStackADT {

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public LinkedListStackADT() {
        top = null;
    }

    // Push
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    // Pop
    public int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int val = top.data;
        top = top.next;
        return val;
    }

    // Peek
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    // isEmpty
    public boolean isEmpty() {
        return top == null;
    }

    // Display
    public void display() {
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
