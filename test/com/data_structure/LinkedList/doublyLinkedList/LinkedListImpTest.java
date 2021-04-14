package com.data_structure.LinkedList.doublyLinkedList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListImpTest {
    Linkable<String> list;

    @BeforeEach
    void setUp() {
     list = new LinkedListImp<>();
    }

    @AfterEach
    void tearDown() {
        list = null;
    }

    @Test
    void list_canAddElementAtFront_ofList() throws LinkedListUnderFlowException {
        list.addFirst("Hello");
        assertFalse(list.isEmpty());
        assertEquals(list.size(), 1);
        assertEquals(list.first(), "Hello");
    }

    @Test
    void list_canAddElementAtLast_ofList() throws LinkedListUnderFlowException {
        list.addLast("I care");
        assertFalse(list.isEmpty());
        assertEquals(list.size(), 1);
        assertEquals(list.last(), "I care");
    }

    @Test
    void list_canRemoveData_atBeginningOfList() throws LinkedListUnderFlowException {
        list.addFirst("Hello");
        list.addLast("How are you");
        assertFalse(list.isEmpty());
        assertEquals(list.size(), 2);
        assertEquals(list.first(), "Hello");
        assertEquals(list.last(), "How are you");

        String data = list.removeFirst();
        assertEquals(data, "Hello");
        assertEquals(list.size(), 1);
    }

    @Test
    void list_canRemoveData_atEndOfList() throws LinkedListUnderFlowException {
        list.addFirst("Hello");
        list.addLast("How are you");
        assertFalse(list.isEmpty());
        assertEquals(list.size(), 2);
        assertEquals(list.first(), "Hello");
        assertEquals(list.last(), "How are you");

        String data = list.removeLast();
        assertEquals(data, "How are you");
        assertEquals(list.size(), 1);
    }

    @Test
    void checkFirst_whenLinkedListISEmpty_ThrowUnderFlowException(){
        assertThrows(LinkedListUnderFlowException.class, ()-> list.first());
    }

    @Test
    void checkLast_whenLinkedListISEmpty_ThrowUnderFlowException(){
        assertThrows(LinkedListUnderFlowException.class, ()-> list.last());

    }

    @Test
    void removeAtTheBeginning_whenLinkedListISEmpty_ThrowUnderFlowException(){
        assertThrows(LinkedListUnderFlowException.class, ()-> list.removeFirst());
    }

    @Test
    void removeAtTheEnd_whenLinkedListISEmpty_ThrowUnderFlowException(){
        assertThrows(LinkedListUnderFlowException.class, ()-> list.removeLast());
    }

    @Test
    void printDataInLinkedList() throws LinkedListUnderFlowException {
        list.addFirst("Hello");
        list.addFirst("Everyone");
        list.addFirst("I you doing ok");
        list.addLast("I love");
        list.addLast("You all");
        assertEquals(list.size(), 5);

        System.out.println(list.toString());

        assertEquals(list.first(), "I you doing ok");
        assertEquals(list.last(), "You all");

    }

    @Test
    void getAnyNodeAtSpecifiedIndex() throws LinkedListUnderFlowException {
        list.addFirst("Hi");
        list.addFirst("How");
        list.addFirst("Hey");
        list.addFirst("House");

        assertEquals(list.find(3), "How");
    }

    @Test
    void getSecondToLastNode() throws LinkedListUnderFlowException {
        list.addFirst("Hi");
        list.addFirst("How");
        list.addFirst("Hey");
        list.addFirst("House");

        assertEquals(list.getSecondNode(), "Hey");
    }

}