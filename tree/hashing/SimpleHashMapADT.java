// File: SimpleHashMapADT.java
import java.util.LinkedList;

public class SimpleHashMapADT {

    class Entry {
        int key;
        int value;

        Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity = 10;
    private LinkedList<Entry>[] table;

    public SimpleHashMapADT() {
        table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++)
            table[i] = new LinkedList<>();
    }

    private int hash(int key) {
        return key % capacity;
    }

    // Put
    public void put(int key, int value) {
        int index = hash(key);
        for (Entry e : table[index]) {
            if (e.key == key) {
                e.value = value;
                return;
            }
        }
        table[index].add(new Entry(key, value));
    }

    // Get
    public int get(int key) {
        int index = hash(key);
        for (Entry e : table[index]) {
            if (e.key == key)
                return e.value;
        }
        return -1;
    }

    // Remove
    public void remove(int key) {
        int index = hash(key);
        table[index].removeIf(e -> e.key == key);
    }
}
