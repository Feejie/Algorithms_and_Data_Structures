package Lesson_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvertReaderTest {

    private InvertReader ir;

    private String text;

    @BeforeEach
    public void init() {
        text = "words";
        ir = new InvertReader(text);
    }

    @Test
    public void reverseTextTest() {
        assertEquals("sdrow", ir.getReverse());
    }

}