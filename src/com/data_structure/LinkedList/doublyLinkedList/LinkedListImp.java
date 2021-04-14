package com.data_structure.LinkedList.doublyLinkedList;

public class LinkedListImp<T> implements Linkable<T>{
    private int size;
    private Node<T> header;
    private Node<T> tailer;
    String message = "Linked list is empty";

    public LinkedListImp() {
        this.size = 0;
        this.header = new Node<>(null, null, null);
        this.tailer = new Node<>(null, header, null);

        this.header.setNext(tailer);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T first() throws LinkedListUnderFlowException {
        if(isEmpty()) throw new LinkedListUnderFlowException(message);
        return getListData(header.getNext());
    }

    private T getListData(Node<T> node) {
        return node.getData();
    }

    @Override
    public T last() throws LinkedListUnderFlowException {
        if(isEmpty()) throw new LinkedListUnderFlowException(message);
        return getListData(tailer.getPrev());
    }


    @Override
    public void addFirst(T t) {
        addToList(t, header, header.getNext());
    }

    private void addToList(T t, Node<T> predecessor, Node<T>  successor) {
        Node<T> newest = new Node<>(t, predecessor, successor);
        predecessor.setNext(newest);
        successor.setPrev(newest);
        size++;
    }

    @Override
    public void addLast(T t) {
        addToList(t, tailer.getPrev(), tailer);
    }

    @Override
    public T removeFirst() throws LinkedListUnderFlowException {
        if(isEmpty()) throw new LinkedListUnderFlowException(message);
        return remove(header.getNext());
    }

    private T remove(Node<T> node) {
        Node<T> predecessor = node.getPrev();
        Node<T> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        return node.getData();
    }

    @Override
    public T removeLast() throws LinkedListUnderFlowException {
        if(isEmpty()) throw new LinkedListUnderFlowException(message);
        return remove(tailer.getPrev());
    }

    @Override
    public T find(int index) throws LinkedListUnderFlowException {
        if(index < 0 || index >= size)  if(isEmpty()) throw new LinkedListUnderFlowException(message);
        Node<T> currentNode;

        if(index <= size / 2){
            currentNode = header;
            for(int count = 1; count <= index; count++){
                currentNode = header.getNext();
            }
        }else {
            currentNode = tailer;
            for(int count = index; count >= 1; count--) {
                currentNode = currentNode.getPrev();
            }
        }
        return currentNode.getData();
    }

    @Override
    public T getSecondNode() throws LinkedListUnderFlowException {
        return find(2);
    }



}
