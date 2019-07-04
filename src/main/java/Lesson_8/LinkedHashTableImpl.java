package Lesson_8;

import java.util.LinkedList;

public class LinkedHashTableImpl {

    private static class Entry {
        private Item key;
        private int value;

        public Entry(Item key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Entry{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

    private LinkedList<Entry>[] hashList;

    private int size;
    private int maxSize;

    public LinkedHashTableImpl(int maxSize) {
        this.maxSize = maxSize;
        this.hashList = new LinkedList[maxSize];
        for (int i = 0; i < maxSize; i++) {
            hashList[i] = new LinkedList<>();
        }
    }

    private int hashFunc(Item key) {
        return key.hashCode() % maxSize;
    }

    private int hashFunc(int id) {
        return id % maxSize;
    }

    public boolean put(Item item, Integer cost) {
        int index = hashFunc(item);
        size++;
        return hashList[index].add(new Entry(item, cost));
    }

    public Entry get(int id) {
        int index = hashFunc(id);
        for (Entry entry : hashList[index]) {
            if (entry.key.getId() == id) {
                return entry;
            }
        }
        return null;
    }

    public Integer get(Item item) {
        int index = hashFunc(item);
        for (Entry entry : hashList[index]) {
            if (entry.key.getId() == item.getId()) {
                return entry.value;
            }
        }
        return null;
    }

    public boolean remove(Item item) {
        int index = hashFunc(item);
        Entry entry = get(item.getId());
        if (hashList[index].contains(entry)) {
            size--;
            return hashList[index].remove(entry);
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        System.out.println("--------");
        for (int i = 0; i < maxSize; i++) {
            System.out.printf("%d = [%s]", i, hashList[i]);
            System.out.println();
        }
        System.out.println("--------");
    }
}
