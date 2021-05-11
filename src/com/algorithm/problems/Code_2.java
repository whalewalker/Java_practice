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


    public boolean solve(int[] nums){
        if(nums.length <= 1){
            return false;
        }

        Arrays.sort(nums);

        int count = 0;
        int counter = 1;

        while (counter < nums.length){
            if(3 * nums[count] == nums[counter]){
                return true;
            }

            if(3 * nums[count] > nums[counter]){
                counter += 1;
            }else {
                count += 1;
            }
        }
        return false;
    }


}
