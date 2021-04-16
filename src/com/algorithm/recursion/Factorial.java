package com.algorithm.recursion;

public class Factorial {
    public static Integer calculateFactorial(Integer number) throws FactorialException {
        int factorial;
        if(number < 0) throw new FactorialException("Number can not be negative");
        else if(number == 0) factorial = 1;
        else factorial = number * calculateFactorial(number - 1);
        return factorial;
    }

}
