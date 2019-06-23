package Lesson_2;

public class Main2 {

    private static Array<Integer> arrayGenerator(int capacity) {
        Array<Integer> arr = new ArrayImpl<>(capacity);
        for (int i = 0; i < capacity; i++) {
            int rnd = (int) (Math.random() * capacity + 1);
            if (!arr.contains(rnd)) {
                arr.add(rnd);
            }
            else {
                i--;
            }
        }

        return arr;
    }

    private static Array getClone(Array source) {
        Array arr = new ArrayImpl<>();
        arr.addAll(source);

        return arr;
    }

    public static void main(String[] args) {
        Array<Integer> arrayOrigin = arrayGenerator(10000);

        Array<Integer> clone1 = getClone(arrayOrigin);
        Array<Integer> clone2 = getClone(arrayOrigin);
        Array<Integer> clone3 = getClone(arrayOrigin);

        clone1.sortBubble();
        clone2.sortSelect();
        clone3.sortInsert();
    }

}
