package com.algorithm.tictactoe.exception;

public class MoveOutOfBoundException extends Exception{
    public MoveOutOfBoundException(String message) {
        super(message);
    }
}
