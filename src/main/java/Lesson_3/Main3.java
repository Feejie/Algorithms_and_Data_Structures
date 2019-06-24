package Lesson_3;

import Lesson_3.queue.*;
import Lesson_3.stack.Stack;
import Lesson_3.stack.StackImpl;

public class Main3 {

    public static void main(String[] args) {

        stackTest();

//        priorityQueueTest();

//        queueTest();

//        dequeueTest();
    }

    private static void stackTest() {
        Stack<Integer> stack = new StackImpl<>(5);

        addToStack(stack, 1);
        addToStack(stack, 2);
        addToStack(stack, 3);
        addToStack(stack, 4);
        addToStack(stack, 5);
        addToStack(stack, 6);

        System.out.println("Stack size: " + stack.size());
        System.out.println("Stack top: " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    private static void priorityQueueTest() {
        Queue<Integer> queue = new PriorityQueue<>(5);
        System.out.println(queue.insert(2));
        System.out.println(queue.insert(5));
        System.out.println(queue.insert(1));
        System.out.println(queue.insert(4));
        System.out.println(queue.insert(3));
        System.out.println(queue.insert(6));

        printing(queue);
    }

    private static void queueTest() {
        Queue<Integer> queue = new QueueImpl<>(5);
        System.out.println(queue.insert(1));
        System.out.println(queue.insert(2));
        System.out.println(queue.insert(3));
        System.out.println(queue.insert(4));
        System.out.println(queue.insert(5));
        System.out.println(queue.insert(6));

        printing(queue);
    }

    private static void dequeueTest() {
        Dequeue<Integer> queue = new DequeueImpl<>(5);
        System.out.println(queue.insertRight(1));
        System.out.println(queue.insertRight(2));
        System.out.println(queue.insertLeft(3));
        System.out.println(queue.insertLeft(4));
        System.out.println(queue.insertRight(5));
        System.out.println(queue.insertRight(6));

        printing(queue);
    }

    private static void addToStack(Stack<Integer> stack, int value) {
        if (!stack.isFull()) {
            stack.push(value);
        }
    }

    private static void printing(Queue<Integer> queue) {
        System.out.println("Queue peek: " + queue.peek());
        System.out.println("Queue size: " + queue.size());
        System.out.println("Queue is full: " + queue.isFull());

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
