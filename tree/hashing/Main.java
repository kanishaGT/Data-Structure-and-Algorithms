public class Main {
    public static void main(String[] args) {

        SimpleHashMapADT map = new SimpleHashMapADT();

        map.put(1, 100);
        map.put(11, 200); // collision
        map.put(2, 300);

        System.out.println(map.get(1)); // 100
        System.out.println(map.get(11)); // 200

        map.remove(1);
        System.out.println(map.get(1)); // -1
    }
}
