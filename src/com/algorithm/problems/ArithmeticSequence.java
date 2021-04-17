package com.algorithm.problems;

public class ArithmeticSequence {

    public int difference(int first, int second){
        return second - first;
    }
    int missingValue = 0;
    public int solve(int[] nums){
        int diff  = difference(nums[0], nums[1]);
        int first = nums[0];

        for(int count = 1; count < nums.length; count++){
            if(diff + first == nums[count]){
                first += diff;
            }else {
                missingValue = first + diff;
                break;
            }
        }
        return missingValue;
    }

    public static void main(String[] args) {
        ArithmeticSequence sequence = new ArithmeticSequence();
        System.out.println(sequence.solve(new int[]{2, 4, 8, 12}));
    }
}
