package com.algorithm.tictactoe;

import com.algorithm.tictactoe.exception.AlreadyOccupiedException;
import com.algorithm.tictactoe.exception.GameOverException;
import com.algorithm.tictactoe.exception.MoveOutOfBoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
    }

    @Test
    void testThatPlayCanMakeAMove() throws MoveOutOfBoundException, AlreadyOccupiedException, GameOverException {
        game.makeMove(9);
        Value[][] array = game.getBoard();
        assertEquals(Value.X, array[2][2]);
    }

    @Test
    void testThatXCannotBePlayedTwice() throws MoveOutOfBoundException, AlreadyOccupiedException, GameOverException {
        game.makeMove(9);
        Value[][] array = game.getBoard();
        assertEquals(Value.X, array[2][2]);
        game.makeMove(8);
        assertNotEquals(Value.X, array[2][1]);
        assertEquals(Value.O, array[2][1]);
    }

    @Test
    void testThatPlayerCanMakeMoveOutOfBound(){
        assertThrows(MoveOutOfBoundException.class, ()-> game.makeMove(10));
    }

    @Test
    void testThatWinnerCanBeDetermined() throws MoveOutOfBoundException, AlreadyOccupiedException{
        try {
            game.makeMove(1); //x
            game.makeMove(4); //0
            game.makeMove(2); //x
            game.makeMove(5); //0
            game.makeMove(3); //x
            game.isGameWon();
            assertTrue(game.isWon());
        }catch (GameOverException ignore){}

        game.displayBoard();
    }
}