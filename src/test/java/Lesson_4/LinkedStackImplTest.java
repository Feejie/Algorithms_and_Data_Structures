package Lesson_4;

import Lesson_3.stack.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedStackImplTest {

    private Stack<Integer> linkedStack;

    @BeforeEach
    void init() {
        linkedStack = new LinkedStackImpl<>();

        linkedStack.push(1);
        linkedStack.push(2);
        linkedStack.push(3);
    }

    @Test
    void popTest() {
        assertEquals(3, linkedStack.pop());
        assertEquals(2, linkedStack.pop());
    }

    @Test
    void peekTest() {
        assertEquals(3, linkedStack.peek());
        linkedStack.pop();
        assertEquals(2, linkedStack.peek());
    }

}