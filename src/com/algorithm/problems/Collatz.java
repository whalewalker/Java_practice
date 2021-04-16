package com.algorithm.problems;

public class Collatz {
    int count = 0;
    public int solve(int number) {
        if(number == 1)return count;
        recursive(number);
        return count;
    }

    private void recursive(int number) {
        if(isEven(number))number = even(number);
        else number = odd(number);
        count++;
        solve(number);
    }

    public int even(int n){
        return n / 2;
    }

    public int odd(int n){
        return (3 * n) + 1;
    }

    public boolean isEven(int number){
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Collatz collatz = new Collatz();
        System.out.println(collatz.solve(334498989));
    }
}
