package Lesson_3;

import Lesson_3.stack.Stack;
import Lesson_3.stack.StackImpl;

public class InvertReader {

    private Stack<Character> stack;
    private final String text;

    public InvertReader(String text) {
        this.text = text;
        stack = new StackImpl<>(text.length());
    }

    public String getReverse() {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }

        for (int i = 0; i < text.length(); i++) {
            arr[i] = stack.pop();
        }

        return String.valueOf(arr);
    }

}
