// File: ArrayStackADT.java
public class ArrayStackADT {

    private int[] stack;
    private int top;
    private int capacity;

    public ArrayStackADT(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    // 1️⃣ Push
    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
    }

    // 2️⃣ Pop
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    // 3️⃣ Peek
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    // 4️⃣ isEmpty
    public boolean isEmpty() {
        return top == -1;
    }

    // 5️⃣ Size
    public int size() {
        return top + 1;
    }

    // 6️⃣ Display Stack
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}
