package Lesson_3;

import Lesson_3.queue.Queue;
import Lesson_3.queue.QueueImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    Queue<Integer> queue;

    @BeforeEach
    void init() {
        queue = new QueueImpl<>(5);
    }

    @ParameterizedTest
    @ValueSource(ints = {1})
    void fillingTest(int value) {
        assertTrue(queue.insert(value));
        assertTrue(queue.insert(value));
        assertTrue(queue.insert(value));
        assertTrue(queue.insert(value));
        assertTrue(queue.insert(value));
        assertFalse(queue.insert(value));
    }

    @Test
    void removeTest() {
        queue.insert(4);
        queue.insert(2);
        queue.insert(5);
        queue.insert(1);
        queue.insert(3);

        assertEquals(4, queue.remove());
        assertEquals(2, queue.remove());
    }
}
