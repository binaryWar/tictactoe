package TicTacToe;

import TicTacToe.Controllers.GameController;
import TicTacToe.Models.*;
import TicTacToe.stratgies.ColumnWinningStrategies;
import TicTacToe.stratgies.DiagonalWinningStragies;
import TicTacToe.stratgies.RowWinningStrategies;
import TicTacToe.stratgies.WinningStrategy;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        System.out.println("Game is starting ");
        Scanner sc = new Scanner(System.in);
        try{
            int dimension  = 3;
            List<Player> players = new ArrayList<>();
            players.add(new HumanPlayer(1,"satyam",new Symbol('X',"Green")));
            players.add(new BotPlayer(2,"rahul",new Symbol('O',"Red"),BotDifficultyLevel.EASY));

            List<WinningStrategy>winningStrategies = new ArrayList<>();
            winningStrategies.add(new RowWinningStrategies());
            winningStrategies.add(new ColumnWinningStrategies());
            winningStrategies.add(new DiagonalWinningStragies());

            Game game = gameController.startGame(dimension,players,winningStrategies);

            while(gameController.chekcGameState(game).equals(GameState.IN_PROGRESS)){
                gameController.displayBoard(game);
                System.out.println("You want to undo ?? Y/N ");
                String x = sc.next();
                if(x.equals("Y")){
                    gameController.undo(game);
                    System.out.println("After undo : :");
                    gameController.displayBoard(game);
                }else if(x.equals("N")){

                }else{

                }
                gameController.makeMove(game);
            }
            if(gameController.chekcGameState(game).equals(GameState.SUCCESS)){
//                gameController.displayBoard(game);
                System.out.println("******* Game ended successfully **********");
                System.out.println("Winner is" + gameController.getWinner(game));
            }else{
                System.out.println("Game over!!!!!!!!!!!!!!"+gameController.chekcGameState(game));
            }

        }catch (Exception e){
            System.out.println("Something went wrong");
            e.printStackTrace();
        }

//        Game game = gameController.startGame(3,new ArrayList<>(),new ArrayList<>());
//        Game game1 = gameController.startGame(3,new ArrayList<>(),new ArrayList<>());


//        if(gameController.chekcGameState(game).equals(GameState.DRAW)){
//            System.out.println("The game ends in draw");
//        }else if(gameController.chekcGameState(game).equals(GameState.SUCCESS)){
//            System.out.println("The game ends in success"+gameController.getWinner(game));
//        }
    }
}
