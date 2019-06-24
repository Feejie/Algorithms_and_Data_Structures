package Lesson_4;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSideLinkedListImplTest {

    private TwoSideLinkedList<Integer> linkedList;

    @BeforeEach
    void init() {
        linkedList = new TwoSideLinkedListImpl<>();

        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
    }

    @Test
    void insertLastTest() {
        linkedList.insertLast(4);

        assertTrue(linkedList.contains(4));
        assertEquals(3, linkedList.getFirstElement());
    }

    @Test
    void removeTest() {
        assertEquals(3, linkedList.removeFirst());
        assertTrue(linkedList.remove(2));
        assertFalse(linkedList.remove(55));
    }

}