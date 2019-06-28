package Lesson_6;

public class Main6 {

    public static void main(String[] args) {
        testTree();

//        Tree<Integer> tree = new TreeImpl<>();
    }

    private static void testTree() {
        Tree<Integer> tree = new TreeImpl<>();
        tree.add(60);
        tree.add(50);
        tree.add(66);
        tree.add(70);
        tree.add(67);
        tree.add(81);
        tree.add(40);
        tree.add(31);
        tree.add(45);
        tree.add(55);
        tree.add(57);

        System.out.println("Root is 60: " + tree.find(60));
        System.out.println("Find 70: " + tree.find(70));
        System.out.println("Find 31: " + tree.find(31));
        System.out.println("Find 111: " + tree.find(111));

        tree.traverse(Tree.TraverseMode.IN_ORDER);
    }
}
