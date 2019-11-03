package ua.edu.ucu.collections;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void testAdd() {
        Stack new_stack = new Stack();
        new_stack.add(1);
        new_stack.add(2);
        new_stack.add(3);
        assertEquals("1 2 3 ", new_stack.toString());
    }

    @Test
    public void testPeek() {
        Stack new_stack = new Stack();
        new_stack.add(1);
        new_stack.add(2);
        new_stack.add(3);
        Object actualResult = new_stack.peek();
        assertEquals(3, actualResult);
        assertEquals("1 2 3 ", new_stack.toString());
    }

    @Test
    public void testPop() {
        Stack new_stack = new Stack();
        new_stack.add(1);
        new_stack.add(2);
        new_stack.add(3);
        Object actualResult = new_stack.pop();
        assertEquals(3, actualResult);
        assertEquals("1 2 ", new_stack.toString());
    }


}
