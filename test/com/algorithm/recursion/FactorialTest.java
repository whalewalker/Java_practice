package com.algorithm.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void checkIfTheFactorialOfThreeIsSix() throws FactorialException {
        Integer number = 3;
        Integer factorial = Factorial.calculateFactorial(number);
        assertEquals(factorial, 6);
    }

    @Test
    void throwFactorialExceptionWhenNumberIsNegative() {
        Integer number = -3;
        assertThrows(FactorialException.class, ()-> Factorial.calculateFactorial(number));
    }

    @Test
    void checkIfTheFactorialOfZeroIsOne() throws FactorialException {
        Integer number = 0;
        Integer factorial = Factorial.calculateFactorial(number);
        assertEquals(factorial, 1);
    }


}