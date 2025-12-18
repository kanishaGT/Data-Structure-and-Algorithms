// File: Main.java
public class Main {
    public static void main(String[] args) {

        DoublyLinkedListADT list = new DoublyLinkedListADT();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        System.out.print("Forward: ");
        list.traverseForward();   // 10 20 30

        System.out.print("Backward: ");
        list.traverseBackward();  // 30 20 10

        list.insertAtBeginning(5);
        System.out.print("After Insert Beginning: ");
        list.traverseForward();   // 5 10 20 30

        list.insertAtPosition(2, 15);
        System.out.print("After Insert Position 2: ");
        list.traverseForward();   // 5 10 15 20 30

        list.deleteFirst();
        System.out.print("After Delete First: ");
        list.traverseForward();   // 10 15 20 30

        list.deleteLast();
        System.out.print("After Delete Last: ");
        list.traverseForward();   // 10 15 20

        list.deleteAtPosition(1);
        System.out.print("After Delete Position 1: ");
        list.traverseForward();   // 10 20

        System.out.println("Search 20: " + list.search(20)); // 1

        list.update(1, 99);
        System.out.print("After Update: ");
        list.traverseForward();   // 10 99
    }
}
