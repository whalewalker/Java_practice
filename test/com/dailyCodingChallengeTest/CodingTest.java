package com.dailyCodingChallengeTest;

import com.algorithm.problems.Code_1;
import com.algorithm.problems.Code_2;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class CodingTest {

    @Test
    void checkIfSumOfTwoNumberInListResultToAGivenNumber(){
        int number = 17;
        int[] numberList = {2, 5, 6, 8, 3, 9};

        Code_1 challenge = new Code_1();
        int value = challenge.calculateSum(number, numberList);
        assertEquals(17, value);
    }

    @Test
    void collectAllTheProductOfANumberInAListExceptFromThePositionInWhichTheCountIs(){
        int[] compareTo = {2, 3, 6};
        int[] arr = {3, 2, 1};

        Code_2 challenge = new Code_2();
        int[] result = challenge.calculateProduct(arr);
        assertEquals( Arrays.toString(compareTo), Arrays.toString(result));
    }

    @Test
    void test(){

    }
}
