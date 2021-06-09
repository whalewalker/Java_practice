package com.algorithm.tictactoe;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    Board board;

    @BeforeEach
    void setUp() {
        board = new Board();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void boardArrayShouldNotBeNullOnInitialization(){
        assertNotNull(board.getArray());
    }

    @Test
    void boardArrayShouldBeFilledWithEmptyValueOnInitialization(){
        Value[][] array = board.getArray();
        for (Value[] values : array) {
            for (Value value : values) {
                assertEquals(value, Value.EMPTY);
            }
        }
    }
}