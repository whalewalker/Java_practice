package com.algorithm.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Code_2 {

    public int[] calculateProduct(int[] arr) {
        int[] newArr = new int[arr.length];

        for(int count = 0; count < arr.length; count++){
            int product = 1;
            for(int counter = 0; counter < arr.length; counter++){
                if(counter == count){
                    continue;
                }
                product *= arr[counter];
            }
            newArr[count] = product;
        }
        return newArr;
    }


}
