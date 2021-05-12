package com.data_structure.LinkedList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularlyLinkedListTest {
    CircularlyLinkedList<String> list;

    @BeforeEach
    void setUp() {
        list = new CircularlyLinkedList<>();
    }

    @AfterEach
    void tearDown() {
        list = null;
    }

    @Test
    void list_canInsertDataAtTheBeginningOfList(){
        list.addFirst("Hello");
        assertEquals(list.size(), 1);
        assertFalse(list.isEmpty());
        assertEquals("Hello", list.first());
    }

    @Test
    void list_canInsertMoreThanOneDataAtTheFirstOfList(){
        list.addFirst("Hello");
        assertEquals(list.size(), 1);
        assertFalse(list.isEmpty());
        assertEquals("Hello", list.first());

        list.addFirst("Wow");
        list.addFirst("Pray");
        list.addFirst("Play");

        assertEquals(list.size(), 4);
    }

    @Test
    void list_canInsertDataAtTheEndOfList(){
        list.addLast("Hello");
        assertEquals(list.size(), 1);
        assertFalse(list.isEmpty());
        assertEquals("Hello", list.last());
    }

    @Test
    void list_canInsertMoreThanOneDataAtTheLastOfList(){
        list.addLast("Hello");;
        assertEquals(list.size(), 1);
        assertFalse(list.isEmpty());
        assertEquals("Hello", list.last());

        list.addLast("Wow");
        list.addLast("Pray");
        list.addLast("Play");

        assertEquals(list.size(), 4);
        assertEquals("Play", list.last());

    }

    @Test
    void list_insertAtFront_RemoveNodeAFrontFromList(){
        list.addFirst("Hello");
        assertEquals("Hello", list.removeFirst());
        assertEquals(list.size(), 0);
        assertTrue(list.isEmpty());
    }

    @Test
    void list_canRotateNodeInList(){
        list.addLast("Wow");
        list.addLast("Pray");
        list.addLast("Play");
        assertEquals("Wow", list.first());

        assertEquals(list.size(), 3);
        assertFalse(list.isEmpty());
        list.rotate();
        assertEquals("Pray", list.first());
    }

    @Test
    void list_removeNode_whenListIsEmpty(){
        assertNull(list.removeFirst());
    }

    @Test
    void list_callFirstWhenListEmpty(){
        assertNull(list.first());
    }

    @Test
    void list_callLastWhenListEmpty(){
        assertNull(list.last());
    }
}