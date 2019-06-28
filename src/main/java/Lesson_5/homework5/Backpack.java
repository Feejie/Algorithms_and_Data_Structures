package Lesson_5.homework5;

import java.util.ArrayList;
import java.util.List;

public class Backpack {

    private static class Item {
        protected String title;
        protected int weight;
        protected int cost;

        public Item(String title, int weight, int cost) {
            this.title = title;
            this.weight = weight;
            this.cost = cost;
        }

    }

    private List<Item> backpack;

    private int maxWeight;
    private int bestCost;

    public Backpack(int maxWeight) {
        this.backpack = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    private int calcWeight(List<Item> items) {
        int sumWeight = 0;
        for (Item item : items) {
            sumWeight += item.weight;
        }
        return sumWeight;
    }

    private int calcPrice(List<Item> items) {
        int sumPrice = 0;
        for (Item item : items) {
            sumPrice += item.cost;
        }
        return sumPrice;
    }

    private void bestSet(List<Item> items) {
        if (backpack.size() == 0) {
            if (calcWeight(items) <= maxWeight) {
                backpack = items;
                bestCost = calcPrice(items);
            }
        } else {
            if (calcWeight(items) <= maxWeight && calcPrice(items) > bestCost) {
                backpack = items;
                bestCost = calcPrice(items);
            }
        }
    }

    public void lay(List<Item> items) {
        if (items.size() > 0) {
            bestSet(items);
        }

        for (int i = 0; i < items.size(); i++) {
            List<Item> list = new ArrayList<>(items);
            list.remove(i);
            lay(list);
        }
    }

    public void info() {
        for (Item item : backpack) {
            System.out.println("Item: " + item.title + "  Cost: " + item.cost + "  Weight: " + item.weight);
        }
    }



    public static void main(String[] args) {
        Backpack bp = new Backpack(5);
        List<Item> items = new ArrayList<>();

        items.add(new Item("Book", 1, 600));
        items.add(new Item("Binokulars", 2, 5000));
        items.add(new Item("MedChest", 4, 1500));
        items.add(new Item("Laptop", 2, 40000));
        items.add(new Item("Kettle", 1, 500));

        bp.lay(items);
        bp.info();
    }
}
