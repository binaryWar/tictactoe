package TicTacToe.Controllers;

import TicTacToe.Models.Board;
import TicTacToe.Models.Game;
import TicTacToe.Models.GameState;
import TicTacToe.Models.Player;
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
    public void displayBoard(Game game){}
    public void makeMove(Game game){

    }
    public GameState chekcGameState(Game game){
        return null;
    }
    public void undo(Game game){}
    public String getWinner(Game game){
        return null;
    }
}
// client to gameController - > Service

// 1. start the game
// 2. while the game state is IN_PROGRESS
    // 2.1 display the board
    // 2.2 make the move
// 3 based on Game State  you will return the result


// UNDO function
