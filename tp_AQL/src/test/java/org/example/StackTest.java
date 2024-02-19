package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import org.example.Stack;
import org.junit.Test;

public class StackTest {

    @Test
    public void testPush() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

    }

    @Test
    public void testPop() {
        Stack stack = new Stack();

        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPeek() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);

        assertEquals(1, stack.peek());
        assertEquals(2, stack.peek()); // Vérifie que peek ne retire pas l'élément
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testIsEmpty() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());

        stack.push(1);
        assertTrue(stack.isEmpty());

        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testSize() {
        Stack stack = new Stack();
        assertEquals(0, stack.size());

        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.size());

        stack.pop();
        assertEquals(1, stack.size());

        stack.pop();
        assertEquals(0, stack.size());
    }

    @Test
    public void testPopOnEmptyStack() {
        Stack stack = new Stack();
        stack.pop();
    }

    @Test
    public void testPeekOnEmptyStack() {
        Stack stack = new Stack();
        stack.peek();
    }

    // Vous pouvez ajouter d'autres cas de test pour couvrir d'autres scénarios.
}
