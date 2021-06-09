package com.algorithm.tictactoe;

public enum Value {
    X, O, EMPTY;


    @Override
    public String toString() {
        String value = "";

        switch (this){
            case O -> value = "X";
            case X -> value = "O";
            case EMPTY -> value = " ";
        }
        return value;
    }
}
