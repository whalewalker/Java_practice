package com.data_structure.learning;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ADTTest {
    ArrayStack<Integer> stack;

    @BeforeEach
    void setUp() {
        stack = new ArrayStackImpl<Integer>();
    }

    @AfterEach
    void tearDown() {
        stack = null;
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
        ArrayStack<Integer> stack = new ArrayStackImpl<>(3);
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

}