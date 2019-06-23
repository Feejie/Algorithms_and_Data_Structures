package Lesson_4.dz2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkIteratorImplTest {

    private LinkedListIter list;

    private LinkIterator itr;

    @BeforeEach
    void init() {
        list = new LinkedListIter();
        itr = new LinkIteratorImpl(list);
    }

    @Test
    void reset() {
        itr.insertAfter("Avksentiy", 112);
        itr.insertBefore("Lukeriya", 814);
        itr.insertAfter("Mstislav", 95);

        itr.reset();

        assertEquals("Lukeriya", itr.getCurrent().name);
    }

    @Test
    void getCurrent() {
        itr.insertAfter("Mstislav", 95);
        itr.insertAfter("Fedosiya", 351);

        assertEquals("Fedosiya", itr.getCurrent().name);
    }

    @Test
    void deleteCurrent() {
        itr.insertAfter("Avksentiy", 112);
        itr.insertBefore("Lukeriya", 814);
        itr.insertAfter("Mstislav", 95);
        itr.deleteCurrent();

        assertEquals("Avksentiy", itr.getCurrent().name);
    }
}