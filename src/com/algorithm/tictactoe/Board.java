package com.algorithm.tictactoe;

public class Board {

    private final Value[][] array;

    public Board() {
        array = new Value[3][3];
        for(int row = 0; row < array.length; row++){
            for (int column = 0; column < array.length; column++){
                array[row][column] = Value.EMPTY;
            }
        }
    }

    public Value[][] getArray() {
        return array;
    }

//    Display Board

    public void displayBoard(){
        for (Value[] values : array) {
            for (Value value : values) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }


}
