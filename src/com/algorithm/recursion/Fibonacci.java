package com.algorithm.recursion;

public class Fibonacci {
    public static int calculateFibonacci(int length){
        if(length <= 0)
            return 0;
        else if(length == 1)
            return 1;
        else
            return calculateFibonacci(length - 1) + calculateFibonacci(length - 2);
    }

    public static void main(String[] args) {
        System.out.println(calculateFibonacci(100));
    }
}
