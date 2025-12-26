// File: MinHeapADT.java
public class MinHeapADT {

    private int[] heap;
    private int size;
    private int capacity;

    public MinHeapADT(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    // Get parent and child indices
    private int parent(int i) { return (i - 1) / 2; }
    private int leftChild(int i) { return 2 * i + 1; }
    private int rightChild(int i) { return 2 * i + 2; }

    // Insert
    public void insert(int value) {
        if (size == capacity) {
            System.out.println("Heap Overflow");
            return;
        }

        heap[size] = value;
        int current = size;
        size++;

        // Heapify up
        while (current != 0 && heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    // Remove Min (root)
    public int extractMin() {
        if (size == 0) {
            System.out.println("Heap Underflow");
            return -1;
        }

        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;

        heapify(0);
        return min;
    }

    // Heapify down
    private void heapify(int i) {
        int smallest = i;
        int left = leftChild(i);
        int right = rightChild(i);

        if (left < size && heap[left] < heap[smallest])
            smallest = left;

        if (right < size && heap[right] < heap[smallest])
            smallest = right;

        if (smallest != i) {
            swap(i, smallest);
            heapify(smallest);
        }
    }

    // Swap
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Display
    public void display() {
        for (int i = 0; i < size; i++)
            System.out.print(heap[i] + " ");
        System.out.println();
    }
}
