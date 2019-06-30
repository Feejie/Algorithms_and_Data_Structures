package Lesson_6;

import java.util.Random;

public class Main6 {

    public static void main(String[] args) {
//        testTree();

        testBalancedTree(20,4, -20, 20);
    }

    private static void testBalancedTree(int quantity, int depth, int min, int max) {
        Random random = new Random();
        int balancedTrees = 0;

        for (int i = 0; i < quantity; i++) {
            Tree<Integer> tree = new TreeImpl<>(depth);

            treeGenerator(depth, min, max, random, tree);

            if (tree.isBalanced()) {
                balancedTrees++;
                tree.display();
            }
        }

        System.out.println("Balanced Trees: " + ((balancedTrees / (quantity * 1.0)) * 100) + "%");
    }

    private static void treeGenerator(int depth, int min, int max, Random random, Tree<Integer> tree) {
        for (int j = 0; j < (int)Math.pow(2, depth) - 1; j++) {
            tree.add(random.nextInt((max - min) + 1) + min);
        }
    }

    private static void testTree() {
        Tree<Integer> tree = new TreeImpl<>(6);
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
