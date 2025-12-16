public class Main {

    public static void main(String[] args) {

        ArrayADT a = new ArrayADT(10);

        a.insert(0, 10);
        a.insert(1, 20);
        a.insert(2, 30);
        a.insert(3, 40);

        System.out.print("Array: ");
        a.traverse();

        a.insert(2, 25);
        System.out.print("After Insert: ");
        a.traverse();

        a.delete(1);
        System.out.print("After Delete: ");
        a.traverse();

        int index = a.search(30);
        System.out.println("30 found at index: " + index);

        a.update(0, 99);
        System.out.print("After Update: ");
        a.traverse();
    }
}
