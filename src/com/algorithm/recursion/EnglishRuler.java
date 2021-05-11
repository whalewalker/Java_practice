package com.algorithm.recursion;

public class EnglishRuler {
    public static void drawRuler(int inches, int majorLength){
        drawLine(majorLength, 0);
        for(int count = 1; count <= inches; count++){
            drawInterval(majorLength - 1);
            drawLine(majorLength, count);
        }
    }

    private static void drawInterval(int centralLength) {
        if(centralLength >= 1){
            drawInterval(centralLength - 1);
            drawLine(centralLength);
            drawInterval(centralLength - 1);
        }
    }

    private static void drawLine(int tickLength, int tickLabel) {
        for(int count = 0; count < tickLength; count++) {
            System.out.print("-");
        }
        if(tickLabel >= 0) {
            System.out.print(" " + tickLength);
        }
        System.out.println();
    }

    private static void drawLine(int tickLength) {
        drawLine(tickLength, -1);
    }


    public static void main(String[] args) {
        drawRuler(1, 10);
    }
}
