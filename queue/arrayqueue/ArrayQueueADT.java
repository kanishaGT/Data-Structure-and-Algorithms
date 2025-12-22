// File: ArrayQueueADT.java
public class ArrayQueueADT {

    private int[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public ArrayQueueADT(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    // 1️⃣ Enqueue
    public void enqueue(int value) {
        if (size == capacity) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
    }

    // 2️⃣ Dequeue
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int val = queue[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }

    // 3️⃣ Peek
    public int peek() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    // 4️⃣ isEmpty
    public boolean isEmpty() {
        return size == 0;
    }

    // 5️⃣ Size
    public int size() {
        return size;
    }

    // 6️⃣ Display
    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        int count = 0;
        while (count < size) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % capacity;
            count++;
        }
        System.out.println();
    }
}
