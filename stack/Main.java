// File: Main.java
public class Main {
    public static void main(String[] args) {
        ArrayStackADT stack = new ArrayStackADT(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.print("Stack: ");
        stack.display(); // 30 20 10

        System.out.println("Peek: " + stack.peek()); // 30

        System.out.println("Pop: " + stack.pop()); // 30
        System.out.print("After Pop: ");
        stack.display(); // 20 10

        System.out.println("Is Empty? " + stack.isEmpty()); // false
        System.out.println("Size: " + stack.size()); // 2
    }
}
