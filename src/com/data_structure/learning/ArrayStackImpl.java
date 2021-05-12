package com.data_structure.learning;

public class ArrayStackImpl<T> implements Stack<T> {
    public static final int CAPACITY = 8;

    private final T[] data;
    private int length = -1;

    public ArrayStackImpl(){
        this(CAPACITY);
    }

    public ArrayStackImpl(int capacity) {
        this.data = (T[]) new Object[capacity];
    }


    @Override
    public int size() {
        return length + 1;
    }

    @Override
    public boolean isEmpty() {
        return length == -1;
    }

    @Override
    public T top() {
        if(isEmpty()) return null;
        return data[length];
    }

    @Override
    public T pop() {
        if(isEmpty()) return null;
        T answer = data[length];
        data[length] = null;
        length--;
        return answer;
    }


    @Override
    public void push(T t) {
        if(size() == data.length) throw new IllegalStateException("Stack is full");
        data[++length] = t;
    }

}
