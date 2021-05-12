package com.data_structure.learning;

import com.data_structure.LinkedList.SinglyLinkedList;

public class LinkedListStack<T> implements Stack<T>{
  private final SinglyLinkedList<T> list = new SinglyLinkedList<>();

  @Override
  public int size() {
    return list.size();
  }

  @Override
  public boolean isEmpty() {
    return list.isEmpty();
  }

  @Override
  public T top() {
    return list.first();
  }

  @Override
  public T pop() {
    return list.removeFirst();
  }

  @Override
  public void push(T t) {
    list.addFirst(t);
  }
}
