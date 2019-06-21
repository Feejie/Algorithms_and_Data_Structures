package Lesson_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleLinkedListImplTest {

    private LinkedList<Integer> linkedList;

    @BeforeEach
    void init() {
        linkedList = new SimpleLinkedListImpl<>();

        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
    }

    @Test
    void insertTest() {
        assertEquals(3, linkedList.getFirst().value);
    }

    @Test
    void containsTest() {
        assertTrue(linkedList.contains(2));
        assertFalse(linkedList.contains(5));
    }

    @Test
    void removeTest() {
        assertEquals(3, linkedList.removeFirst());
        assertTrue(linkedList.remove(1));
        assertFalse(linkedList.remove(5));
    }

}