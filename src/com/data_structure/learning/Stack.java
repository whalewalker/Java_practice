package com.data_structure.learning;
/*
 A collection of objects that are inserted and removed according to the last-in
 first-out principle. Although similar in purpose, this interface differs from
 java.util.Stack.

 @author Ismail Abdullah .Whalewalker
  */

import java.util.List;

public interface Stack<T>{
    /*
    ∗ Returns the number of elements in the stack.
    ∗ @return number of elements in the stack
*/
    int size();
    boolean isEmpty();
    T top();
    T pop();
    void push(T t);

}
