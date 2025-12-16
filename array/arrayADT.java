public class ArrayADT {

    private int[] arr;
    private int size;    // maximum capacity
    private int length;  // current number of elements

    // constructor
    public ArrayADT(int size) {
        this.size = size;
        this.length = 0;
        arr = new int[size];
    }

    // traverse
    public void traverse() {
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Insert
    public void insert(int index, int value) {
        if (index < 0 || index > length || length == size) {
            System.out.println("Insertion not possible");
            return;
        }

        for (int i = length; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = value;
        length++;
    }

    // Delete
    public void delete(int index) {
        if (index < 0 || index >= length) {
            System.out.println("Deletion not possible");
            return;
        }

        for (int i = index; i < length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        length--;
    }

    // Search
    public int search(int key) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // Update
    public void update(int index, int value) {
        if (index < 0 || index >= length) {
            System.out.println("Invalid index");
            return;
        }
        arr[index] = value;
    }

    // Get
    public int get(int index) {
        if (index < 0 || index >= length) {
            System.out.println("Invalid index");
            return -1;
        }
        return arr[index];
    }
}
