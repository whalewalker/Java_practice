package com.algorithm.simpleAlgo;

public class Pyramid {
    public static void displayPyramid(int rows){

        for (int i = 1; i <= rows; i++)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print(k);
            }
            for (int l = i - 1; l >= 1; l--)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Pyramid.displayPyramid(5);
    }
}


