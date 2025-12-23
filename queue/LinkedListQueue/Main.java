public class Main {
    public static void main(String[] args) {
        LinkedListQueueADT queue = new LinkedListQueueADT();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.print("Queue: ");
        queue.display(); // 10 20 30

        System.out.println("Peek: " + queue.peek()); // 10

        System.out.println("Dequeue: " + queue.dequeue()); // 10
        System.out.print("After Dequeue: ");
        queue.display(); // 20 30

        System.out.println("Is Empty? " + queue.isEmpty()); // false
        System.out.println("Size: " + queue.size()); // 2
    }
}
