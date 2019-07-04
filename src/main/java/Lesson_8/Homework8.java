package Lesson_8;

public class Homework8 {

    public static void main(String[] args) {
        LinkedHashTableImpl hashTable = new LinkedHashTableImpl(5);

        hashTable.put(new Item(1, "Orange"), 150);
        hashTable.put(new Item(77, "Banana"), 100);
        hashTable.put(new Item(77, "Banana"), 228);
        hashTable.put(new Item(60, "Lemon"), 250);
        hashTable.put(new Item(52, "Milk"), 120);
        hashTable.put(new Item(21, "Potato"), 67);

        System.out.println("Size is " + hashTable.getSize());
        hashTable.display();

        System.out.println("Cost potato is " + hashTable.get(new Item(21, "Potato")));
        System.out.println("Cost banana is " + hashTable.get(new Item(77, "Banana")));

        hashTable.remove(new Item(21, "Potato"));
        hashTable.remove(new Item(77, "Banana"));
        System.out.println(hashTable.remove(new Item(85, "Banzana")));

        System.out.println("Cost potato is " + hashTable.get(new Item(21, "Potato")));
        System.out.println("Cost banana is " + hashTable.get(new Item(77, "Banana")));

        hashTable.display();
    }
}
