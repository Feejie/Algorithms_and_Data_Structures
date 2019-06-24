package Lesson_4;

import Lesson_3.queue.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedQueueImplTest {

    private Queue<Integer> linkedQueue;

    @BeforeEach
    void init() {
        linkedQueue = new LinkedQueueImpl<>();

        linkedQueue.insert(1);
        linkedQueue.insert(2);
        linkedQueue.insert(3);
    }

    @Test
    void peekTest() {
        assertEquals(1, linkedQueue.peek());
    }

    @Test
    void removeTest() {
        assertEquals(1, linkedQueue.remove());
    }

}