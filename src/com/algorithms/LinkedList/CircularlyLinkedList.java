package com.algorithms.LinkedList;

public class CircularlyLinkedList<T> {
    private Node<T> tail;
    private int size;

    public CircularlyLinkedList() {
        this.tail = null;
        this.size = 0;
    }

    public void addFirst(T data) {
       if(isEmpty()){
           tail = new Node<>(data, null);
           tail.setNext(tail);
       }
       else {
           Node<T> newNode = new Node<>(data, tail.getNext());
           tail.setNext(newNode);
       }
       size++;

    }

    public void addLast(T data) {
       addFirst(data);
       tail = tail.getNext();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T first() {
        if(isEmpty())
            return null;
        return tail.getNext().getData();
    }

    public T last(){
        if(isEmpty())
            return null;
        return tail.getData();
    }

    public T removeFirst(){
        if(isEmpty())
            return null;
     Node<T> head = tail.getNext();
     if(head == tail)
         size--;
     return head.getData();
    }

    public void rotate() {
        if(tail != null)
            tail = tail.getNext();
    }
}
