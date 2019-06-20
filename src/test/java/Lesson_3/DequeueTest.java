package Lesson_3;

import Lesson_3.queue.Dequeue;
import Lesson_3.queue.DequeueImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


public class DequeueTest {

    Dequeue<Integer> dequeue;

    @BeforeEach
    void init() {
        dequeue = new DequeueImpl<>(5);
    }

    @ParameterizedTest
    @ValueSource(ints = {1})
    void fillingTest(int value) {
        assertTrue(dequeue.insertRight(value));
        assertTrue(dequeue.insertRight(value));
        assertTrue(dequeue.insertLeft(value));
        assertTrue(dequeue.insertRight(value));
        assertTrue(dequeue.insertLeft(value));
        assertFalse(dequeue.insertRight(value));
    }

    @Test
    void mixInsertRemoveTest() {
        dequeue.insertRight(1);
        dequeue.insertRight(2);
        dequeue.insertLeft(3);
        dequeue.insertRight(4);
        dequeue.insertLeft(5);

        assertEquals(4, dequeue.removeRight());
        assertEquals(5, dequeue.removeLeft());
    }

}
