package com.data_structure.LinkedList.doublyLinkedList;

public interface Linkable<T> {
    int size();
    boolean isEmpty();
    T first() throws LinkedListUnderFlowException;
    T last() throws LinkedListUnderFlowException;
    void addFirst(T t);
    void addLast(T t);
    T removeFirst() throws LinkedListUnderFlowException;
    T removeLast() throws LinkedListUnderFlowException;
    T getSecondNode() throws LinkedListUnderFlowException;
    T find(int index) throws LinkedListUnderFlowException;
}
