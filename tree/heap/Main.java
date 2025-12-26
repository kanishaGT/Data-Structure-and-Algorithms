// File: Main.java
public class Main {
    public static void main(String[] args) {

        MinHeapADT heap = new MinHeapADT(10);

        heap.insert(40);
        heap.insert(20);
        heap.insert(30);
        heap.insert(10);
        heap.insert(50);

        System.out.print("Heap: ");
        heap.display(); // 10 20 30 40 50

        System.out.println("Extract Min: " + heap.extractMin()); // 10

        System.out.print("After Extract: ");
        heap.display(); // 20 40 30 50
    }
}
