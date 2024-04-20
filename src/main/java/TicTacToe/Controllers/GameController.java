package TicTacToe.Controllers;

import TicTacToe.Models.*;
import TicTacToe.stratgies.WinningStrategy;

import java.util.List;

public class GameController {
    public Game startGame(
            int dimension,
            List<Player> players,
            List<WinningStrategy>winningStrategies
    ){
        return Game.getGameBuilder().setDimension(dimension).setPlayers(players).setWinningStrategies(winningStrategies).build();
    }
    public void displayBoard(Game game){
      game.displayBoard();
    }
    public void makeMove(Game game){
        game.makeMove();
    }
    public GameState chekcGameState(Game game){
        return game.getGameState();
    }
    public void undo(Game game){
        game.undo();
    }
    public String getWinner(Game game){
        return game.getWinner().getName();
    }
}
// client to gameController - > Service

// 1. start the game
// 2. while the game state is IN_PROGRESS
    // 2.1 display the board
    // 2.2 make the move
// 3 based on Game State  you will return the result


// UNDO function
