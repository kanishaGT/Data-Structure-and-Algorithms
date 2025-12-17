// File: Main.java
public class Main {
    public static void main(String[] args) {

        SinglyLinkedListADT list = new SinglyLinkedListADT();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        System.out.print("List: ");
        list.traverse(); // 10 20 30

        list.insertAtBeginning(5);
        System.out.print("After Insert at Beginning: ");
        list.traverse(); // 5 10 20 30

        list.insertAtPosition(2, 15);
        System.out.print("After Insert at Position 2: ");
        list.traverse(); // 5 10 15 20 30

        list.deleteFirst();
        System.out.print("After Delete First: ");
        list.traverse(); // 10 15 20 30

        list.deleteLast();
        System.out.print("After Delete Last: ");
        list.traverse(); // 10 15 20

        list.deleteAtPosition(1);
        System.out.print("After Delete at Position 1: ");
        list.traverse(); // 10 20

        System.out.println("Search 20: " + list.search(20)); // 1
        System.out.println("Search 30: " + list.search(30)); // -1

        list.update(1, 99);
        System.out.print("After Update index 1 to 99: ");
        list.traverse(); // 10 99

        System.out.println("Get value at index 0: " + list.get(0)); // 10
    }
}
