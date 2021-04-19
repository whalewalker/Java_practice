package com.algorithm.problems;

public class Code_1 {
    private int updateCount;

    public int calculateSum(int number, int[] numberList) {
        int sum = 0;
        for (int count = 1; count < numberList.length; count++){
            for(int counter = 1; counter < numberList.length; counter++){
                sum = numberList[count - 1] + numberList[counter];
                if(sum == number){
                 return sum;
                }
            }
        }
        return sum;
    }

}
