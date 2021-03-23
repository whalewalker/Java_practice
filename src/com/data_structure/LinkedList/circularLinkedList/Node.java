package com.data_structure.LinkedList.circularLinkedList;

public class Node<T> {
    private T data;
    private Node<T> next;

    public T getData() {
        return data;
    }

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
