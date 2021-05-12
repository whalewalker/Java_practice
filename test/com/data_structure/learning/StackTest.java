package com.data_structure.learning;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    Stack<Integer> stack;
    LinkedListStack<Integer> listStack;

    @BeforeEach
    void setUp() {
        stack = new ArrayStackImpl<>();
        listStack = new LinkedListStack<>();
    }

    @AfterEach
    void tearDown() {
        stack = null;
        listStack = null;
    }

    @Test
    void canAddDataToStack(){
        addData();
        assertEquals(stack.size(), 3);
        assertFalse(stack.isEmpty());
        assertEquals(stack.top(), 20);
    }

    private void addData() {
        stack.push(5);
        stack.push(7);
        stack.push(20);
    }

    @Test
    void canRemoveLastDataAdded(){
        addData();
        stack.pop();
        stack.pop();
        assertEquals(stack.size(), 1);
        assertFalse(stack.isEmpty());
        assertEquals(stack.top(), 5);
    }

    @Test
    void addDataToStackWhenStackIsFullThrowStackOverFlowException(){
        Stack<Integer> stack = new ArrayStackImpl<>(3);
        stack.push(5);
        stack.push(7);
        stack.push(20);
        assertThrows(IllegalStateException.class, ()-> stack.push(40));
    }

    @Test
    void popStackWhenEmptyReturnNull(){
        assertNull(stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    void peekWhenStackIsEmptyReturnNull(){
        assertNull(stack.top());
        assertTrue(stack.isEmpty());
    }

    @Test
    void canAddDataToLinkedStack(){
        addDataLinkedStack();
        assertEquals(listStack.size(), 3);
        assertFalse(listStack.isEmpty());
        assertEquals(listStack.top(), 20);
    }

    private void addDataLinkedStack() {
        listStack.push(5);
        listStack.push(7);
        listStack.push(20);
    }

    @Test
    void canRemoveLastDataAddedToLinkedStack(){
        addData();
        listStack.pop();
       assertEquals(listStack.size(), 1);
        assertFalse(listStack.isEmpty());
        assertEquals(listStack.top(), 5);
    }

    @Test
    void popLinkedStackWhenEmptyReturnNull(){
        assertNull(listStack.pop());
        assertTrue(listStack.isEmpty());
    }

    @Test
    void peekWhenLinkedStackIsEmptyReturnNull(){
        assertNull(listStack.top());
        assertTrue(listStack.isEmpty());
    }

}