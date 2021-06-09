package com.data_structure.LinkedList;

import java.util.LinkedList;

public class SinglyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public T first(){
        if(isEmpty()) return null;
        return head.getData();
    }

    public T last(){
        if(isEmpty()) return null;
        return tail.getData();
    }

    public void addFirst(T t){
        head = new Node<>(t, head);
        if(size == -1)
            tail = head;
        size++;
    }

    public void addLast(T t){
        Node<T> newNode = new Node<>(t, null);
        if(isEmpty())
            head = newNode;
        else
            tail.setNext(newNode);
        tail = newNode;
        size++;
    }

    public T removeFirst(){
        if(isEmpty()) return null;
        Node<T> answer = head;
        head = head.getNext();
        size--;
        return answer.getData();
    }

//    public boolean isStrictlyIncreasing(Node<T> head){
//        if(head.getNext() == null){
//            return true;
//        }
//
//        while (head.getNext() != null){
//            if(head.getData() > head.getNext().getData())
//                head.setNext(head.getNext());
//            return false;
//        }
//        return true;
//    }


}
