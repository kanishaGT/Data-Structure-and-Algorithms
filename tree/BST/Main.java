// File: Main.java
public class Main {
    public static void main(String[] args) {

        BSTADT bst = new BSTADT();

        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        System.out.print("Inorder: ");
        bst.inorder(); // 20 30 40 50 60 70 80

        System.out.println("Search 40: " + bst.search(40)); // true

        System.out.print("Level Order: ");
        bst.levelOrder(); // 50 30 70 20 40 60 80

        bst.delete(20); // leaf
        bst.delete(30); // one child
        bst.delete(50); // two children

        System.out.print("After Deletions (Inorder): ");
        bst.inorder();
    }
}
