package TicTacToe;

import TicTacToe.Controllers.GameController;
import TicTacToe.Models.Board;
import TicTacToe.Models.Game;
import TicTacToe.Models.GameState;

import java.util.ArrayList;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        System.out.println("Game is starting ");

        Game game = gameController.startGame(3,new ArrayList<>(),new ArrayList<>());
        Game game1 = gameController.startGame(3,new ArrayList<>(),new ArrayList<>());

        while(gameController.chekcGameState(game).equals(GameState.IN_PROGRESS)){
            gameController.displayBoard(game);
            gameController.makeMove(game);
        }
        if(gameController.chekcGameState(game).equals(GameState.DRAW)){
            System.out.println("The game ends in draw");
        }else if(gameController.chekcGameState(game).equals(GameState.SUCCESS)){
            System.out.println("The game ends in success"+gameController.getWinner(game));
        }
    }
}
