// File: Main.java
public class Main {
    public static void main(String[] args) {

        CircularLinkedListADT list = new CircularLinkedListADT();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        System.out.print("List: ");
        list.traverse(); // 10 20 30

        list.insertAtBeginning(5);
        System.out.print("After Insert Beginning: ");
        list.traverse(); // 5 10 20  30

        list.deleteFirst();
        System.out.print("After Delete First: ");
        list.traverse(); // 10 20 30

        list.deleteLast();
        System.out.print("After Delete Last: ");
        list.traverse(); // 10 20

        System.out.println("Search 20: " + list.search(20)); // 1
        System.out.println("Search 30: " + list.search(30)); // -1

        list.update(1, 99);
        System.out.print("After Update: ");
        list.traverse(); // 10 99
    }
}
