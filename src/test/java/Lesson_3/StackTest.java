package Lesson_3;

import Lesson_3.stack.Stack;
import Lesson_3.stack.StackImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    Stack<Integer> stack;

    @BeforeEach
    void init() {
        stack = new StackImpl<>(5);
    }

    @Test
    void fillingTest() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> stack.push(6));
    }

    @Test
    void removeTest() {
        stack.push(4);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        stack.push(3);

        assertEquals(3, stack.pop());
        assertEquals(1, stack.pop());
    }
}
